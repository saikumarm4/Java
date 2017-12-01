package five;

public class BinarySearchPractise {

	public static void main(String[] args) {
		int[] array = { 12, 1, 2, 3, 4, 5, 6 };
		int key = 12;

		int pivot = findPivot(array, 0, array.length - 1);
		int index = -1;

		if (pivot == -1)
			index = binarySearch(array, key, 0, array.length - 1);
		if (array[pivot] == key) {
			index = pivot;
		} else if (array[pivot] > key) {
			index = binarySearch(array, key, 0, pivot - 1);
		} else {
			index = binarySearch(array, key, pivot + 1, array.length - 1);
		}

		System.out.println(index);
	}

	static int binarySearch(int[] array, int key, int left, int right) {
		if (left <= right) {
			int mid = (left + right) / 2;
			if (array[mid] == key)
				return mid;
			if (array[mid] > key)
				return binarySearch(array, key, left, mid - 1);
			return binarySearch(array, key, mid + 1, right);
		}
		return -1;
	}

	static int findPivot(int[] array, int left, int right) {
		if (left <= right) {
			int mid = (left + right) / 2;
			if (mid < right && array[mid] > array[mid + 1])
				return mid;
			if (mid > left && array[mid - 1] > array[mid])
				return mid - 1;
			if (array[left] >= array[mid])
				return findPivot(array, left, mid - 1);
			return findPivot(array, mid + 1, right);
		}
		return -1;
	}
}
