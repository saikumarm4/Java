public class ElementsAndSumInArray {

	public static void main(String[] args) {

		int[] array = { 28, 29, 30, 1, 2, 3, 6, 8, 9, 10, 16 };
		int sum = -2;
		boolean exists = false;
		int first = -1, second = -1;
		int pivotIndex = findPivot(array, 0, array.length - 1);

		for (int i = 0; i < array.length; i++) {
			first = array[i];
			int differenceKey = sum - array[i];
			int index = -1;
			if (array[pivotIndex] >= differenceKey)
				index = binarySearch(array, differenceKey, pivotIndex,
						array.length - 1);
			else
				index = binarySearch(array, differenceKey, 0, pivotIndex);

			if (index != -1) {
				second = array[index];
				exists = true;
				break;
			}
		}
		System.out.println(exists + " " + first + " " + second);

	}

	public static int findPivot(int[] array, int left, int right) {
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

	public static int binarySearch(int[] array, int key, int left, int right) {
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
}
