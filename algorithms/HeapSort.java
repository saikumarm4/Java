import java.util.Arrays;

public class HeapSort {

	public static void main(String[] args) {
		HeapSort.sort(new int[] { 12, 11, 13, 5, 6, 7 });
	}

	private static void sort(int[] items) {
		int size = items.length;
		for (int i = size / 2 - 1; i >= 0; i--) {
			HeapSort.heapifyDown(items, size, i);
		}

		System.out.println(Arrays.toString(items));

		for (int i = size - 1; i > 0; i--) {
			HeapSort.swap(items, i, 0);
			HeapSort.heapifyDown(items, i, 0);
		}

		System.out.println(Arrays.toString(items));

	}

	private static void heapifyDown(int[] items, int size, int index) {
		int left = 2 * index + 1;
		int right = 2 * index + 2;
		int largest = index;

		if (left < size && items[left] > items[largest])
			largest = left;
		if (right < size && items[right] > items[largest])
			largest = right;

		if (largest != index) {
			HeapSort.swap(items, largest, index);
			HeapSort.heapifyDown(items, size, largest);
		}
	}

	private static void swap(int[] items, int largest, int index) {
		int temp = items[largest];
		items[largest] = items[index];
		items[index] = temp;
	}
}
