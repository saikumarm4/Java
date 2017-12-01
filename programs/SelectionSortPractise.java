package five;

import java.util.Arrays;

public class SelectionSortPractise {

	public static void main(String[] args) {
		int[] array = { 5, 1, 4, 2, 8 };
		System.out.println(Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			int minimumIndex = i;
			int minimumValue = array[i];
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < minimumValue) {
					minimumIndex = j;
					minimumValue = array[j];
				}
			}

			swap(array, i, minimumIndex);
		}
		System.out.println(Arrays.toString(array));

	}

	static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}
}
