package five;

import java.util.Arrays;

public class QuickSortPractise {

	static void swap(int[] array, int pos1, int pos2) {
		int temp = array[pos1];
		array[pos1] = array[pos2];
		array[pos2] = temp;
	}

	static int partition(int[] array, int low, int high) {
		int pivot = array[high];
		int i = low, j = low;
		for (; j <= high - 1; j++) {
			if (array[j] <= pivot) {
				swap(array, i, j);
				i++;
			}
		}
		swap(array, i, high);
		return i;
	}

	static void quickSort(int[] array, int low, int high) {
		if (high > low) {
			int pivotIndex = partition(array, low, high);
			quickSort(array, low, pivotIndex - 1);
			quickSort(array, pivotIndex + 1, high);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 5, 1, 4, 2, -1, 8 };
		System.out.println(Arrays.toString(array));
		quickSort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));
	}

}
