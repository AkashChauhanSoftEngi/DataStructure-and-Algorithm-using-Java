/*
Pair with sum equal to given value
Time-complexity:O(n)
Auxiliary-space:O(n){extra space required for hashmap}
*/

import java.util.HashMap;

class pairSumCheckArray{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,2,9,3,1,-1};
        int K=5;//sum value
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        
        for(int i=0; i<arr.length; i++){
            if(hm.containsKey(K-arr[i])){
                System.out.println(arr[i] + "," + (K-arr[i]));
            }
            else{
                hm.put(K-arr[i],i);
            }
        }
 
    }
}