/*
#Minimum Sum of a number with 2,3,4 division factors
-12--> 12/2,12/3,12,4-->sum=13 but remembere 6,4,3 shpuld not be divided further with 2,3,4 factors but it not true in this case so the output is 6+4+0=10
-for 12 answer is 10 not 13
*/
 import java.lang.*;
 
class MinimumSum{
    public static void main(String[] args){
        int n=12;
        int a,b,c,sum;
        
        a=n/2;
        b=n/3;
        c=n/4;
        
        while(a>(a/2+a/3+a/4)){
            a=(a/2+a/3+a/4);
        }
        while(b>(b/2+b/3+b/4)){
            b=(b/2+b/3+b/4);
        }
        while(c>(c/2+c/3+(c/4))){
            c=(c/2+c/3+c/4);
        }
        sum=a+b+c;
        System.out.println("Minimum Sum:"+sum);
    }
}