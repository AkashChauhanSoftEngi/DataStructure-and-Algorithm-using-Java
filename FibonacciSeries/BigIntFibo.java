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
