package algorithm.sorting.impl;

import java.util.Arrays;
/*
 * Time: o(n^2){Worst/Best}
 * Space: o(1)
 * Maximum Swaps
 * stable, In-place
 * */
public class BubbleSort {
	static int[] array = {2,4,3,5,7,6,9,8,1};
	public static void main(String[] args) {
		bubbleSort(array,array.length);
		System.out.println(Arrays.toString(array));
	}
	
	public static void bubbleSort(int[] array,int l){
		for(int i=l-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(array[j]>array[j+1]){
					swap(j,j+1);
				}
				else{
					continue;
				}
			}
		}
	}
	
	public static void swap(int m, int n){
		int temp;
		temp = array[m];
		array[m]=array[n];
		array[n]=temp;
	}
}
