/*InsertionSort
#start with one card in hand and put it at right location while comparing it from last till first
#Two methods ①shift and swap ② All swap no shift
#Time-best:O(n),worst:O(n^2) 
#Space-best,worst:O(1)
#Swaps-min:O(1), max:O(n){shifting+ last swap},O(n^2){all swap}
#Inplace-yes, no such extra space
#Stable-yes
*/

import java.util.*;

class InsertionSort{
    public static void main(String[] args){
        int[] arr={7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        insertionSortMethodOne(arr, arr.length);
        System.out.println(Arrays.toString(arr));
        insertionSortMethodTwo(arr, arr.length);
        System.out.println(Arrays.toString(arr));
        
    }
    
    //①No of swaps:O(n)
    public static void insertionSortMethodOne(int[] arr1, int len){
        int numOfSwaps=0;
        for (int i=1;i<=len-1;i++){
            int temp=0,settle=arr1[i],index=0;
            for(int j=i;j>=1; j--){
                if(settle<arr1[j-1]){
                    arr1[j]=arr1[j-1];//shifting happens
                    index=j-1;//empty space you can say
                }
            }
            arr1[index]=settle;
            numOfSwaps++;
        }
        System.out.println(numOfSwaps);
    }
    
    //②No of swaps:O(n^2)
    public static void insertionSortMethodTwo(int[] arr1, int len){
        int numOfSwaps=0;
        for (int i=1;i<=len-1;i++){
            int temp=0,index=i;
            for(int j=i-1;j>=0; j--){
                if(arr1[index]<arr1[j]){
                    temp=arr1[j];
                    arr1[j]=arr1[index];
                    arr1[index]=temp;
                    index=j;
                    numOfSwaps++;
                }
            }
        }
        System.out.println(numOfSwaps);
    }
}