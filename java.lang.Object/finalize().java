/*
finalize()
-tells JVM to run important code inside this method before running garbage collector
-This method does not return a value
*/
import java.util.*;
import java.lang.*;

class FinalizeClass
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	        FinalizeClass obj=new FinalizeClass();
	        obj.finalize();
	        
	    } catch(Throwable e) {
	        System.out.println("Throwable Exception here!");
	    }
	    finally{
	        System.out.println("Garbage Collector has run!");
	        
	    }
	}
}

