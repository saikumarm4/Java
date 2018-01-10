import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 90, 64, 25, 99, 12, 22, 11 };
		mergeSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	private static void mergeSort(int[] arr, int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid + 1, high);
			merge(arr, low, mid, high);
		}
	}

	private static void merge(int[] arr, int low, int mid, int high) {
		int N1 = mid - low + 1;
		int N2 = high - mid;
		int[] L1 = new int[N1];
		int[] L2 = new int[N2];
		int k = 0;
		for (int i = low; i <= mid; i++) {
			L1[k] = arr[i];
			k++;
		}
		k = 0;
		for (int i = mid + 1; i <= high; i++) {
			L2[k] = arr[i];
			k++;
		}

		k = low;
		int i = 0, j = 0;
		while (i < N1 && j < N2) {
			if (L1[i] < L2[j]) {
				arr[k] = L1[i];
				i++;
			} else {
				arr[k] = L2[j];
				j++;
			}
			k++;
		}

		while (i < N1) {
			arr[k++] = L1[i++];
		}

		while (j < N2) {
			arr[k++] = L2[j++];
		}
	}
}
