import java.util.*;

public class FibonnaciClass{
    static int sum;
    public static void main(String[] args){
    int b;
    
    //Number of elements
    System.out.println("Enter number of elements");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(n);
    
    //base element
    System.out.println("Enter Base:");
    int a = sc.nextInt();
    
    System.out.println("Series!");
    System.out.print(a);
    
    System.out.print(",");
    b=a+1;
    System.out.print(b);
    printFibonacci(a,b,n);
    
    }
    
    public static void printFibonacci(int s, int p, int n){
        while(n!=0){
        sum = s + p;
        s=p;
        p=sum;
        System.out.print(",");
        System.out.print(sum);
        n--;
        }
        if (n==0){
            return;
        }
    }
}


