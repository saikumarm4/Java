package five;

import java.util.Arrays;

public class MergeSortPractise {

	public static void main(String[] args) {
		int[] array = { 5, 1, 4, 2, 100, 55, -1, 8, 3 };
		merge(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));

	}

	static void merge(int[] array, int left, int right) {
		if (right > left) {
			int mid = (left + right) / 2;
			merge(array, left, mid);
			merge(array, mid + 1, right);
			mergeSort(array, left, mid, right);
		}
	}

	static void mergeSort(int[] array, int left, int mid, int right) {
		int leftHalfOfArraySize = mid - left + 1;
		int rightHalfOfArraySize = right - mid;

		int[] leftHalfOfArray = new int[leftHalfOfArraySize];
		int[] rightHalfOfArray = new int[rightHalfOfArraySize];

		for (int i = 0; i < leftHalfOfArraySize; ++i)
			leftHalfOfArray[i] = array[left + i];
		for (int j = 0; j < rightHalfOfArraySize; ++j)
			rightHalfOfArray[j] = array[mid + 1 + j];

		int i = 0, j = 0, k = left;

		while (i < leftHalfOfArraySize && j < rightHalfOfArraySize) {
			if (leftHalfOfArray[i] >= rightHalfOfArray[j]) {
				array[k] = rightHalfOfArray[j];
				j++;
			} else {
				array[k] = leftHalfOfArray[i];
				i++;
			}
			k++;
		}

		while (i < leftHalfOfArraySize) {
			array[k] = leftHalfOfArray[i];
			k++;
			i++;
		}

		while (j < rightHalfOfArraySize) {
			array[k] = rightHalfOfArray[j];
			j++;
			k++;
		}
	}
}
