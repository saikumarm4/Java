package algorithms;

import java.util.Arrays;

public class CountingSort {

	public static void main(String[] args) {
		// char arr[] = { 'g', 'e', 'e', 'k', 's', 'f', 'o', 'r', 'g', 'e', 'e',
		// 'k', 's' };

		int arr[] = { 1, 4, 1, 2, 7, 5, 2 };
		int countArray[] = new int[256];
		int output[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			countArray[arr[i]]++;
		}

		for (int i = 1; i < 256; i++) {
			countArray[i] += countArray[i - 1];
		}

		for (int i = 0; i < arr.length; i++) {
			output[--countArray[arr[i]]] = arr[i];
		}

		System.out.println(Arrays.toString(output));

	}
}
