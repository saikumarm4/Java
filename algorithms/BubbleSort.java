import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 64, 25, 12, 22, 11 };
		boolean swapped = false;
		while (!swapped) {
			swapped = true;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					swap(arr, i, i + 1);
					swapped = false;
				}
			}
		}

		System.out.println(Arrays.toString(arr));

	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
