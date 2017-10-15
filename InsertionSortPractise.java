package five;

import java.util.Arrays;

public class InsertionSortPractise {

	public static void main(String[] args) {
		int[] array = { 5, 1, 4, 2, 8, 3 };
		sort(array);
		System.out.println(Arrays.toString(array));
	}

	static void sort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int placeHolder = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > placeHolder) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = placeHolder;

		}

	}
}
