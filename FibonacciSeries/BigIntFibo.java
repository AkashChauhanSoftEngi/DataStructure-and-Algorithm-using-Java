// Creating a fibonacci series for very large number of elements using BigInteger.

/* BigInteger Class in Java. 
   BigInteger class is used for mathematical operation which involves very big integer calculations that are outside the limit of all available primitive data types.
   For example factorial of 100 contains 158 digits in it so we can't store it in any primitive data type available.
 */

import java.math.*;
import java.util.*;

public class Exe1 {
	private static Map<Integer, BigInteger> memo = new HashMap<>();

	public static BigInteger f(int n) {
		if (n == 0 || n == 1) {
			return BigInteger.ONE;
		}
		if (memo.containsKey(n)) {
			return memo.get(n);
		}
		BigInteger v = f(n - 2).add(f(n - 1));
		memo.put(n, v);
		return v;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(f(8181));
	}
}
