/*
#Leaders in an array
-Given an zero indexed unsorted array find(if exist) the leaders in an array.
-An element is leader if it is greater than all the elements to its right side,the rightmost element is always a leader. 
-For example int the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2
-Time-complexity: O(n)
-Auxiliary-space: O(1)
*/

class LeadersInArray{
    public static void main(String[] args){
        int[] arr={16, 17, 4, 3, 5, 2};
        printLeaders(arr,arr.length-1);
    }
    public static void printLeaders(int[] arr, int len){
        int i;
        int max=arr[len];
        System.out.print(max);
        i=len-1;
        while(i>=0){
            if(max<arr[i]){
                System.out.print(",");
                max=arr[i];
                System.out.print(max);
                i--;
            }
            else{
                i--;
            }
        }
    }
}