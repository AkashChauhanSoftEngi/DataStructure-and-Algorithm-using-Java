/*BubbleSort
#Swaping elements if they are in wrong orders,→\/→←
#Time-best,worst:O(n^2) 
#Space-best,worst:O(1)
#Swaps-max:O(n^2){n.(n-1)/2}, min:O(1)
#Inplace-yes, no such extra space
#Stable-yes, same order
*/

import java.util.*;

class BubbleSort{
    public static void main(String[] args){
        int[] arr={7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        bubbleSortMethod(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void bubbleSortMethod(int[] arr1, int len){
        
        for (int i=1;i<=len-1;i++){
             int j=len-1, temp;
             while(i<=j){
                 if(arr1[j]<arr1[j-1]){
                     temp=arr1[j-1];
                     arr1[j-1]=arr1[j];
                     arr1[j]=temp;
                 }
                 j--;
             }
            } 
        } 
    }