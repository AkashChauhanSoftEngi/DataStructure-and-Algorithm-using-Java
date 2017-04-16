/*
#Reverse Array
#Time O(n), space O(1)
#Iterative and Recursive
*/

import java.util.*;

class ArrayReverse{
    public static void main(String[] args){
        int[] arrayInt = {1,2,3,4,5,6,7};
        System.out.println("arrayInt:" + Arrays.toString(arrayInt));
        
        System.out.println("Iterative O(n) space:");
        System.out.println("arrayInt:" + Arrays.toString((iterativeMethod1(arrayInt))));
        
        System.out.println("Iterative O(1) space:");
        int left = 0;
        int right= arrayInt.length-1;
        iterativeMethod2(arrayInt,left,right);
        System.out.println("arrayInt:" + Arrays.toString(arrayInt));
        
        System.out.println("Recursive O(1) space:");
        recursiveMethod(arrayInt,left,right);
        System.out.println("arrayInt:" + Arrays.toString(arrayInt));
        
    }
    
    //Iterative taking O(n) space instead O(1)
    public static int[] iterativeMethod1(int[] arr1){
        int len=arr1.length-1;
        int[] arr2=new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            arr2[i]=arr1[len];
            len--;
        }
        return arr2;
    }
    
    //Iterative but O(1) space
    public static void iterativeMethod2(int[] arr1, int left, int right){
        int temp;
        while (left<=right)
        {
        temp = arr1[left];
        arr1[left]  = arr1[right];
        arr1[right] = temp;
        left++;
        right--;
        }
    }
    
    //Recursive
    public static void recursiveMethod(int[] arr2, int left, int right){
        int temp;
        temp = arr2[left];
        if(left<=right)
        {
        arr2[left]  = arr2[right];
        arr2[right] = temp;
        left++;
        right--;
        }
        else{
            return;
        }
        recursiveMethod(arr2, left, right);
    }
    
}
