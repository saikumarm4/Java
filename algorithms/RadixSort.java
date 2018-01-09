package algorithms;

import java.util.Arrays;

public class RadixSort {
	/*
	 * RadixSort only works for Numbers
	 */

	public static void main(String[] args) {
		int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
		int maxNumber = getMaxNumber(arr);
		for (int significiantPosition = 1; (maxNumber / significiantPosition) > 0;) {
			insertionSort(arr, significiantPosition);
			significiantPosition *= 10;
		}
		System.out.println(Arrays.toString(arr));

	}

	private static void insertionSort(int[] arr, int significantPosition) {
		int pivotSignificantDigit = 1, pivot = -1;
		int j = -1;
		for (int i = 1; i < arr.length; i++) {
			pivot = arr[i];
			pivotSignificantDigit = getSignificantDigit(arr[i],
					significantPosition);
			j = i - 1;
			while (j >= 0
					&& (getSignificantDigit(arr[j], significantPosition)) > pivotSignificantDigit) {
				swap(arr, j, j + 1);
				j--;
			}
			arr[j + 1] = pivot;
		}
	}

	private static void countingSort(int[] arr, int significantPosition) {
		int[] countArray = new int[10];
		int[] output = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			countArray[getSignificantDigit(arr[i], significantPosition)]++;
		}

		for (int i = 1; i < countArray.length; i++) {
			countArray[i] += countArray[i - 1];
		}

		System.out.println(Arrays.toString(countArray));

		for (int i = arr.length - 1; i >= 0; i--) {
			output[countArray[getSignificantDigit(arr[i], significantPosition)] - 1] = arr[i];
			countArray[getSignificantDigit(arr[i], significantPosition)]--;
		}

		for (int i = 0; i < arr.length; i++)
			arr[i] = output[i];

		System.out.println(Arrays.toString(arr));
	}

	private static void swap(int[] arr, int j, int i) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static int getSignificantDigit(int number, int significiantPosition) {
		return (number / significiantPosition) % 10;
	}

	private static int getMaxNumber(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

}
