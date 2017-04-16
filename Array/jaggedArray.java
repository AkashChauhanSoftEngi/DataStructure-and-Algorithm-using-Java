import java.util.*;
import java.lang.*;
import java.io.*;

//Jagged Array in Java
//an create a 2-D arrays but with variable number of columns in each row
class JaggedArray
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int r=5;
	    
	    // Declaring 2-D array with 5 rows
	    int array[][] = new int[r][];
		
		// Creating a 2D array such that first row
        // has 1 element, second row has two 
        // elements and so on.
		for (int i=0;i<array.lenght;i++)
		{
		    array[i]=new int[i+1];
		}
		
		// Initializing array
	    int count=0;
	    for (int i=0;i<array.lenght;i++)
	    {
	        for (int j=0;j<array[i].lenght;j++ ) 
	        {
	            array[i][j]=count++;
	        }
	    }
	    
	    
		System.out.println("Array");
	}
}
