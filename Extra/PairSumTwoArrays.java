class Solution{
    public static void main(String[] args){
        int[] arrayOne = {1,2,3,4};
        int[] arrayTwo = {1,2,3,4};
        Solution obj = new Solution();
        System.out.println("Number of Pairs:" + obj.pairSum(arrayOne,arrayTwo));
    }
    
    int pairSum(int[] a, int[] b){
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++){
                if(((a[i]+b[j])%2==0))
                {
                    sum++;
                }
            }
        }
        return sum;
    }
}