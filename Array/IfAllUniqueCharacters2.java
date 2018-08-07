package com.project.java;

/*
 * Time o(n)
 * Space o(1)
 * */

public class IfAllUniqueCharacters2 {
	void printRepeating(int arr[], int size) {
		
		System.out.println("Missing Element: ");
		int sum =0;
		int actualSum=0;
		int j=0;
		for( int num : arr) {
	          sum = sum+num;
	          actualSum = actualSum + j;
	          j++;
	      }
		int diff = actualSum - sum;
		
		int i;
		System.out.println("The repeating elements are : ");

		for (i = 0; i < size; i++) {
			if (arr[Math.abs(arr[i])] >= 0) {
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			} else{
				System.out.print(Math.abs(arr[i]) + " ");
				System.out.println("Diff: " + (Math.abs(arr[i]) + diff));
			}
		}
		
	}

	// Driver program
	public static void main(String[] args) {
		IfAllUniqueCharacters2 obj = new IfAllUniqueCharacters2();
		int arr[] = { 0, 1, 2, 2, 4, 5, 6, 7, 8, 9};
		int arr_size = arr.length;
		obj.printRepeating(arr, arr_size);
	}
}
