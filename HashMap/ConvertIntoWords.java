package com.project.java.sample;

import java.util.HashMap;
import java.util.Map;

/*
 * Write a program to create a parser which parses a string form of a currency number into its equivalent word form. 
   For eg, if input is - “12,345”, 
   then output would be: “Twelve thousand, three hundred forty five”.
 * */
public class ConvertIntoWords {
	static Map<Integer, String> single_Digit = new HashMap<Integer, String>();
	static Map<Integer, String> two_Digit = new HashMap<Integer, String>();
	static Map<Integer, String> tens_Multiple = new HashMap<Integer, String>();
	static Map<Integer, String> tens_Power = new HashMap<Integer, String>();
	
	public static void main(String[] args) {
		convertIntoWords("12,345");
		convertIntoWords("22,345");
		convertIntoWords("92,345");
	}
	
	public static void convertIntoWords(String s){
		
		/*Remove "," from the string*/
		String p = s.replaceAll(",", "");

		Integer a = Integer.parseInt(p);
		Integer b = a;
		
		/* Populate the data*/
		single_Digit.put(1, "one");
		single_Digit.put(2, "two");
		single_Digit.put(3, "three");
		single_Digit.put(4, "four");
		single_Digit.put(5, "five");
		single_Digit.put(6, "six");
		single_Digit.put(7, "seven");
		single_Digit.put(8, "eight");
		single_Digit.put(9, "nine");

		two_Digit.put(10, "ten");
		two_Digit.put(11, "eleven");
		two_Digit.put(12, "twelve");
		two_Digit.put(13, "thirteen");
		two_Digit.put(14, "fourteen");
		two_Digit.put(15, "fifteen");
		two_Digit.put(16, "sixteen");
		two_Digit.put(17, "seventeen");
		two_Digit.put(18, "eighteen");
		two_Digit.put(19, "nineteen");
		
		tens_Multiple.put(20,"twenty");
		tens_Multiple.put(30,"thirty");
		tens_Multiple.put(40,"forty" );
		tens_Multiple.put(50,"fifty");
		tens_Multiple.put(60,"sixty");
		tens_Multiple.put(70,"seventy");
		tens_Multiple.put(80,"eighty");
		tens_Multiple.put(90,"ninety");
		
		tens_Power.put(100,"hundred");
		tens_Power.put(1000,"thousand");
		
		/*Main Logic*/
		int len = p.length();
		if(len==1)
		{
			System.out.println(single_Digit.get(Integer.parseInt(p)));
		}
		
		if (len == 2 && p.startsWith("1")){
			System.out.println(two_Digit.get(b));
		}
		
		if(len == 2 && !p.startsWith("1")){
			twoDigits(b);
		}
		
		if (len == 3){
			threeDigits(b);
		}
		
		if (len == 4){
			fourDigits(b);
		}
		
		if (len == 5 && p.startsWith("1")){
			fiveDigits(b);
		}
		
		if (len == 5 && !p.startsWith("1")){
			fiveDigitsStartExceptOne(b);
		}
		System.out.println();
	}
	
	public static void fiveDigitsStartExceptOne(int b){
		int temp1 = b/1000;
		int temp2 = b%1000;
		twoDigits(temp1);
		System.out.print(" " + tens_Power.get(1000) + " ");
		threeDigits(temp2);
	}
	
	public static void fiveDigits(int b){
		int temp1 = b/1000;
		int temp2 = b%1000;
		System.out.print(two_Digit.get(temp1) + " ");
		System.out.print(tens_Power.get(1000) + " ");
		threeDigits(temp2);
	}
	
	public static void fourDigits(int b){
		int temp1 = b/1000;
		int temp2 = b%1000;
		System.out.print(single_Digit.get(temp1) + " ");
		System.out.print(tens_Power.get(1000) + " ");
		threeDigits(temp2);
	}
	
	public static void threeDigits(int b){
		int temp1 = b/100;
		int temp2 = b%100;
		System.out.print(single_Digit.get(temp1) + " ");
		System.out.print(tens_Power.get(100) + " ");
		twoDigits(temp2);
	}
	
	public static void twoDigits(int b){
		int temp1 = (b/10)*10;
		int temp2 = b%10;
		System.out.print(tens_Multiple.get(temp1) + " ");
		System.out.print(single_Digit.get(temp2));
	}
}
