/*
#Array rotation-I (Reversal Algorithm)
-Given an zero indexed array and positive integer d,rotate the array by d-steps to the left.
-Reversal Algorithm
-Time-complexity:O(n)
-Auxiliary-space:O(1)
*/

import java.lang.*;
import java.util.*;

class ArrayRotate{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        int d=3;//for element d rotate array to d step left
        rotateArray(arr, arr.length, d);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void rotateArray(int[] arr, int len, int d){
        
        if(d>len){
        d=d%len;
        }
        
        reverseArray(arr,0,d-1);
        reverseArray(arr,d,len-1);
        reverseArray(arr,0,len-1);
        return;
    }
    
    public static void reverseArray(int[] arr, int s, int e){
        while(s<e){
            int temp;
            temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}