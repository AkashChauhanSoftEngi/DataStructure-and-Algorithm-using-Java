import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Nthfibo
{	
 public static int getNthfibo(int a, int b,int n) {
        if (n < 0) {
            throw new IllegalArgumentException("The fibo value cannot be negative");
        }
        int num = 10000007;
		int result[][] = {{((a+b)%num),b%num},{b%num,a%num}}; 
		if(n==0){ return result[1][1];}
		else if(n==1) return result[0][1];
		else if(n==2) return result[0][0];
 
        int[][] Q = {{1, 1}, {1, 0}};
 
        while (n > 0) {
            if (n%2 == 1) {
                multMatrix(result,Q,num);
                // result[0][0] = result[0][0]%num;
                // result[1][0] = result[1][0]%num;
                // result[0][1] = result[0][1]%num;
                // result[1][1] = result[1][1]%num;
            }
            n = n / 2;
            multMatrix(Q,Q,num);
        }
 
        return result[1][1];
    }
 
    private static void multMatrix(int[][] m, int [][] n,int num) {
        int a = (m[0][0] * n[0][0] +  m[0][1] * n[1][0])%num;
        int b = (m[0][0] * n[0][1] +  m[0][1] * n[1][1])%num;
        int c = (m[1][0] * n[0][0] +  m[1][1] * n[0][1])%num;
        int d = (m[1][0] * n[0][1] +  m[1][1] * n[1][1])%num;
 
        m[0][0] = a;
        m[0][1] = b;
        m[1][0] = c;
        m[1][1] = d;
    }
 
	public static void main (String[] args) throws java.lang.Exception
	{	
            System.out.println(getNthfibo(3,4,3));
	}
}