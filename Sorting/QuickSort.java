/*QuickSort
#Choose pivot element and find appropriate location for the element using left and right marks
#Time-best:O(nlogn),worst:O(n^2) 
#Space-best,worst:O(1)
#Inplace-yes, no such extra space
#Stable-no
*/

import java.util.*;

class QuickSort
{
    public static void main(String[] args){
        int[] arr={1,2,3,8,1,2,3};
        System.out.println("Initial:" + Arrays.toString(arr));
        quickSort(arr);
        System.out.println("Result:" + Arrays.toString(arr));
    }
    
    public static void quickSort(int[] arr){
        //if array is null or empty
        if (arr==null && arr.length==0){
            return;
        }
        quickSortMethod(arr,0,arr.length-1);
    }
    
    
    public static void quickSortMethod(int[] arr, int left, int right){
        int pivot=arr[left + (right-left)/2];
        int l=left;
        int r=right;
        
        while (l<=r){
            while (arr[l]<pivot){
                l++;
            }
            while (arr[r]>pivot){
                r--;
            }
            if (l<=r)
            {
                exchangeElements(arr,l,r);
                l++;
                r--;
            }
        }
        
        //split point
        if (left<r) {
            quickSortMethod(arr,left,r);
        }
        if(l<right){
            quickSortMethod(arr,l,right);
        }
    } 
    public static void exchangeElements(int[] arr, int l, int r){
        int temp=arr[r];
        arr[r]=arr[l];
        arr[l]=temp;
    }
}