/*
#Smallest and second smallest in an arra
#Time O(n), space O(1)
*/

class smallestElement{
    public static void main(String [] args)
    {
        int[] arr = {1,2,3,4,5,6,7};
        int len,smallest, secSamllest;
        if(arr[0]<arr[1])
        {
            smallest=arr[0];
            secSamllest=arr[1];
        }
        else{
            smallest=arr[1];
            secSamllest=arr[0];
        }
        len=arr.length;
        while(len>0)        {
            if(smallest>arr[len-1]){
            secSamllest=smallest;
            smallest=arr[len-1];
        }
        len--;
        }
    System.out.println(smallest+","+secSamllest);
    }
}