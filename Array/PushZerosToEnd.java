/*
#Move all zeros to end
-Given an array of random numbers, Push all the zero's of a given array to the end of the array
-Time-complexity: O(n)
-Auxiliary-space: O(1)
-there is another way to do it by adding two sequencial loops, one for non negative and second is for filling zeros after conter till length(Smart way)
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class PushZerosAtEnd
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int s=0,e,temp,i;
		int[] arr={1,2,3,0,0,6,7,4,0,4,2,0,1,9,0};
		e=(arr.length-1);
		System.out.println("Initial Array:"+Arrays.toString(arr));
		
		while(s<=e)
		{
		    if(arr[s]!=0){
		        s++;
		    }
		    else{
		        //e will only increments while there is a zero
		        while(arr[e]==0){
		        e--;
		        }
		        if(arr[e]!=0){
		        temp=arr[e];
		        arr[e]=arr[s];
		        arr[s]=temp;
		        s++;
		        e--;
		        }
		    }
		}
		
		System.out.println("Result Array:"+Arrays.toString(arr));
	}
}
