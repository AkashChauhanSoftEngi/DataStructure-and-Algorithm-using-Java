/*
keys are unique but value can vary, so in case of duplicates, it updates previous value with new one
Hash Table is the table we form in HashMap
*/
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class HashMapClass
{
	public static void main (String[] args) throws java.lang.Exception
	{
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"A");
		hm.put(2,"B");
		hm.put(3,"C");
		hm.put(3,"D");
		for (Map.Entry m:hm.entrySet()){
		    System.out.println(m.getKey() + ", " + m.getValue());
		} 
	}
}
