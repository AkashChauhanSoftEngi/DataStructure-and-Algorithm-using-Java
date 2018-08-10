package algorithm.sorting.impl;

import java.util.Arrays;
/*
 * Time: o(n^2){Worst/Best}
 * Space: o(1)
 * Stable, In-place{No}
 * Lesser swaps than Bubble Sort
 * */
public class SelectionSort {
	static int[] array = { 2, 4, 3, 5, 7, 6, 9, 8, 1 ,1};

	public static void main(String[] args) {
		selectionSort(array, array.length);
		System.out.println(Arrays.toString(array));
	}

	public static void selectionSort(int[] array, int l) {
		int max;
		for (int i = l - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				max = array[i];
				if (array[j] > max) {
					swap(j, i);
				} else {
					continue;
				}
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
