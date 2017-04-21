/*
Print 2D-array in spiral order
e.g.  {{1,2,3},{4,5,6},{7,8,9}} => 1 2 3 6 9 8 7 4 5
*/
import java.util.*;
import java.lang.*;

class twoDArraySpiralOrder{
    public static void main(String[] args){
        int m=3;//no of rows
        int n=3;//no of columns
        int x=0;//starting row index
        int y=0;//statring column index
        int i;//iterator
    
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        
        System.out.println("Simple Order");
        //simple order
        for (i=0;i<=m-1 ;i++){ 
            for (int j=0;j<=n-1 ;j++){ 
            System.out.print(a[i][j]);
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Spiral Order");
        //Spiral order
        while (x<m && y<n){
            
            /* Print the first row from the remaining rows */
            for (i=y; i<n; i++) {
            System.out.print(a[x][i]);
            }
            x++;
            
            /* Print the last column from the remaining columns */
            for (i=x;i<m ;i++)
            {
            System.out.print(a[i][n-1]);
            }
            n--;
            
            /* Print the last row from the remaining rows */
            if(x<m){
            for (i=n-1; i>=y;i--){ 
            System.out.print(a[m-1][i]);
            }
            m--;
            }
            
             /* Print the first column from the remaining columns */
            if(y<n){
            for (i=m-1;i>=x; i--){
            System.out.print(a[i][y]);
            }
            y++;
            }
        }
    }
}