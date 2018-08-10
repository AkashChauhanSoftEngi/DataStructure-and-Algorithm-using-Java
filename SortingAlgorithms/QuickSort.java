package algorithm.sorting.impl;

import java.util.Arrays;

/*
 * Time: o(nlogn) {Worst/Best}
 * Space: o(1)
 * stable{yes, Same order as original}, In-place{Yes, no extra memory required!}
 * */
public class QuickSort {
	static int[] array = { 2, 4, 3, 5, 7, 6, 9, 8, 1 ,1};

	public static void main(String[] args) {
		System.out.println("Before Quick Sort: ");
		System.out.println(Arrays.toString(array));

		quickSort(0, array.length - 1);
		System.out.println("After Quick Sort: ");
		System.out.println(Arrays.toString(array));
	}

	public static void quickSort(int left, int right) {
		if (right - left <= 0) {
			return;
		} else {
			int partition = partition(left, right);
			quickSort(left, partition - 1);
			quickSort(partition + 1, right);
		}
	}

	public static int partition(int left, int right) {
		int leftPtr = left - 1;
		int pivot = array[right];
		int rightPtr = right;
		while (true) {
			while (array[++leftPtr] < pivot)
				;
			while (rightPtr > 0 && array[--rightPtr] > pivot)
				;
			if (leftPtr >= rightPtr) {
				break;
			}
			swap(leftPtr, rightPtr);
		}
		swap(leftPtr, right);
		return leftPtr;
	}

	public static void swap(int m, int n) {
		int temp;
		temp = array[m];
		array[m] = array[n];
		array[n] = temp;
	}

}
