package com.project.java;

/*
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you can not use additional data structures?
 * */

public class IfAllUniqueCharacters {

	public static void main(String[] args) {
		String string = "abcde";

		boolean result = isUniqueCharOne(string);
		System.out.println(result);

		System.out.println("----------------------");

		result = isUniqueCharTwo(string);
		System.out.println(result);

	}

	/*
	 * Time: o(n^2) Space: o(0)
	 */
	public static boolean isUniqueCharOne(String string) {
		for (int i = 0; i < string.length(); i++) {
			for (int j = 0; j < string.length(); j++) {
				if (string.charAt(i) == string.charAt(j) && (i != j)) {
					return true;
				}
			}
		}
		return false;
	}

	/*
	 * Time: o(n) Space: o(1)
	 */
	public static boolean isUniqueCharTwo(String string) {
		boolean[] booleanArray = new boolean[256];
		for (int i = 0; i < string.length(); i++) {
			int value = string.charAt(i);
			if (booleanArray[value] == true) {
				return true;
			} else {
				booleanArray[value] = true;
			}
		}
		return false;
	}
}
