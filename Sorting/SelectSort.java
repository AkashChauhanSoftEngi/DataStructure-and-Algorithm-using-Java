/*SelectSort
#find min/max in each iteration and swap values
#Time-best,worst:O(n^2) 
#Space-best,worst:O(1)
#Swaps-max:O(n^2){n.(n-1)/2}, min:O(1)
#Inplace-yes, no such extra space
#Stable-No
*/

import java.util.*;

class SelectionSort{
    public static void main(String[] args){
        int[] arr={7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        selectionSortMethod(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void selectionSortMethod(int[] arr1, int len){
        int index=0, temp=0;
        for (int i=0;i<=len-1 ;i++ ){
            int min=arr1[i];
            for (int j=i; j<=len-1; j++){
                if(min>arr1[j]){
                    min=arr1[j];
                    index=j;
                }
            }
            temp=arr1[i];
            arr1[i]=arr1[index];
            arr1[index]=temp;
        } 
    }
}