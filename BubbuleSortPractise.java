package five;

import java.util.Arrays;

public class BubbuleSortPractise {

	public static void main(String[] args) {
		int[] array = { 5, 1, 4, 2, 8 };
		System.out.println(Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++)
				if (array[i] > array[j]) {
					swap(array, i, j);
				}
		}
		System.out.println(Arrays.toString(array));

	}

	static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}
}
