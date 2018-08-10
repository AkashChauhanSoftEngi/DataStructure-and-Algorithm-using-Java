package algorithm.sorting.impl;

import java.util.Arrays;

/*
 * Time: o(n + k)
 * Space: o(n) {For new Array}
 * stable{Yes}, In-place{No, extra space needed for extra array}
 * Not good when large numbers included in the array, so much space will be wasted!
 * */
public class CountingSort {
	static int[] array = { 2, 4, 3, 5, 7, 6, 9, 8, 1 , 1};
	public static void main(String[] args){
		int max = array[0];
		int i=1;
		while (i < array.length) {
			if(max<array[i]){
				max=array[i];
			}
			i++;
		}
		System.out.println("Array before counting Sort: ");
		System.out.println(Arrays.toString(array));
		int[] countingArray = new int[max+1];
		CountingSort obj = new CountingSort();
		obj.countingSort(array, countingArray);
		System.out.println("Array after counting Sort: ");
		System.out.println(Arrays.toString(array));
	}
	
	public void countingSort(int[] array, int[] countingArray){
		int k=0;
		for (int i = 0; i < array.length; i++) {
			countingArray[array[i]]=countingArray[array[i]] + 1;
		}
		for(int j=0;j<countingArray.length;j++){
			while(countingArray[j]>0){
				array[k++] = j;
				countingArray[j] = countingArray[j]-1;
			}
		}
	}
}
