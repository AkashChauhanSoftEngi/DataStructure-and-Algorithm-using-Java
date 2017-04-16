/*
#Replace every element by product of previous and next
#Time O(n), space O(1)
*/

import java.util.*;

class ProductArray{
    public static void main(String[] args)
    {
        int[] arr= {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        productArrayMethod(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void productArrayMethod(int[] arr1, int len)
    {
        int i=1, current;
        int prev=arr1[0];
        
        //first Element
        arr1[0]=prev*arr1[1];
        
        while(i<len-1){
            current=arr1[(i)];
            arr1[i]=prev*arr1[(i+1)];
            prev = current;
            i++;
        }
        //last element
        arr1[len-1]=prev*arr1[len-1];
    }
}
