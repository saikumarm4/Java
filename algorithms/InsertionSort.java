import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 64, 25, 12, 22, 11 };
		int pivot = -1;
		int j = -1;
		for (int i = 1; i < arr.length; i++) {
			pivot = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] > pivot) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = pivot;
		}

		System.out.println(Arrays.toString(arr));

	}

}
