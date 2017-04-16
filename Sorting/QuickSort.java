/*QuickSort
#Choose pivot element and find appropriate location for the element using left and right marks
#Time-best:O(nlogn),worst:O(n^2) 
#Space-best,worst:O(1)
#Swaps-best:O(1), worst()
#Inplace-yes, no such extra space
#Stable-yes
*/

import java.util.*;

class QuickSort{
    public static void main(String[] args){
        int[] arr={7,6,5,4,3,2,1};
        System.out.println("jjhj:" + Arrays.toString(arr));
        quickSortMethod(arr,arr.length);
        System.out.println("Result:" + Arrays.toString(arr));
        
    }
    
    //①No of swaps:O(n)
    public static void quickSortMethod(int[] arr1, int len){
        int l=1,r=len-1;
        int pivot=arr1[0];
        int left=arr1[l];
        int right=arr1[r];
        for (int i=0;i<=len-1 ;i++){
                
            while(left<pivot){
                l++;
            }
            while(right>pivot){
                r--;
            }
            while(left>pivot){
                
                //right is larger than pivot
                if(arr1[r]>pivot){
                    r--;
                }
                
                //right is smaller than pivot(left>pivot>right)
                else{
                    exchangeElements(arr1,l,r);
                    l++;
                    r--;
                }
            }
            while(right<pivot){
                 exchangeElements(arr1,l,r);
                    l++;
                    r--;
            }
        }
        } 
        
    }
    public static void exchangeElements(int[] arr2, int l, int r){
        int temp=0;
        temp=arr2[r];
        arr2[r]=arr2[l];
        arr2[l]=temp;
    }
}