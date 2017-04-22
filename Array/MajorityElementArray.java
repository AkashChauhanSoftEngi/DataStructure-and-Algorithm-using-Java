/*
#Majority Element in an Array)
-Find majority element(if exists) in a given array.
(The majority element is the element that appears more than ⌊ n/2 ⌋ times)

#Majority element in unsorted array(Moore`s voting algorithm)
-Time-complexity: O(n)
-space-complexity: O(1)

-----------------------------------------------------------------------
#Majority element in sorted array(Using Binary search algorithm)
-Time-complexity: O(logn)
-Space-complexity:O(1)
-in another file!

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class MajorityElement{
    public static void main(String[] args){
        int[] arr1={1,2,4,4,4,4,6,6,6,6,6,6,6,6};//soted array
        int r1=inSortedArray(arr1,arr1.length-1);
        System.out.println("Majority Element inSortedArray:" + r1);//6
        
        int[] arr2={4,7,4,5,4,3,2,4,4,3,4};//unsorted array
        int r3=inUnsortedArray(arr2,arr2.length-1);
        System.out.println("Majority Element inUnsortedArray:" + r3);//4
    }
    
    
    public static int inSortedArray(int[] arr, int len){
        int count=0, maj_index=0;
        int candidate;
        for (int i=0;i<=len;i++){
            if(arr[i]==arr[maj_index]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                maj_index=i;
                count=1;
            }
        }
        candidate=arr[maj_index];
        
        int mid=0;
        mid=(len+1)/2;
        
        if(arr[mid]==candidate){
            return candidate;
        }
        else{
            return -1;
        }
    }
    
    //Moore's voting
    public static int inUnsortedArray(int[] arr, int len){
        int count=0, maj_index=0;
        int candidate;
        for (int i=0;i<=len;i++){
            if(arr[i]==arr[maj_index]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                maj_index=i;
                count=1;
            }
        }
        candidate=arr[maj_index];
        
        for (int i=0;i<=len ;i++){
            if(arr[i]==arr[maj_index]){
                count++;
            }
        } 
        if(count>=((len+1)/2))
        {
            return arr[maj_index];
        }
        else{
            return -1;
        }
    }
}

