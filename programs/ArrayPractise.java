package five;

import java.util.Arrays;

import sun.security.util.Length;

public class ArrayPractise {

	public static void main(String[] args) {
		reverselAlgorith();
	}

	public static void splitArray() {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		int rotateSize = 4;
		int[] tempA = new int[2];
		int i = 0;

		tempA = Arrays.copyOfRange(a, 0, rotateSize);
		for (; i < a.length - rotateSize; i++) {
			a[i] = a[rotateSize + i];
		}

		for (int j = 0; j < rotateSize; j++) {
			a[i++] = tempA[j];
		}

		System.out.println(Arrays.toString(a));
	}

	public static void rotateByOne() {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		int rotateSize = 2;
		while (rotateSize > 0) {
			int temp = a[0];
			int i = 0;
			for (; i < a.length - 1; i++) {
				a[i] = a[i + 1];
			}
			a[i] = temp;
			rotateSize--;
		}
		System.out.println(Arrays.toString(a));
	}

	public static void reverselAlgorith() {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		int rotateSize = 4;
		int[] aReverse = Arrays.copyOfRange(a, 0, rotateSize);
		int[] bReverse = Arrays.copyOfRange(a, rotateSize, a.length);
		reverse(aReverse);
		reverse(bReverse);

		int i = 0;
		for (i = 0; i < rotateSize; i++) {
			a[i] = aReverse[i];
		}
		for (; i < a.length; i++) {
			a[i] = bReverse[i - rotateSize];
		}
		reverse(a);
		System.out.println(Arrays.toString(a));
	}

	public static void reverse(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			swap(array, i, array.length - i - 1);
		}
	}

	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
