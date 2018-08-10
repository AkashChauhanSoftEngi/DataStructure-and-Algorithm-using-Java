package algorithm.sorting.impl;

import java.util.Arrays;

/*
 * Time: o(n^2) {Worst/Best}
 * Space: o(1)
 * stable, In-place
 * */
public class InsertionSort {
	static int[] array = { 2, 4, 1, 5, 7, 6, 9, 8, 3, 1 };

	public static void main(String[] args) {
		insertionSort(array, array.length);
		System.out.println(Arrays.toString(array));
	}

	public static void insertionSort(int[] array, int l) {
		for (int i = 1; i <= l - 1; i++) {
			int j = i;
			while ((j > 0) && (array[j - 1] > array[j])) {
				swap(j, j - 1);
				j--;
			}
		}
	}

	public static void swap(int m, int n) {
		int temp;
		temp = array[m];
		array[m] = array[n];
		array[n] = temp;
	}
}
