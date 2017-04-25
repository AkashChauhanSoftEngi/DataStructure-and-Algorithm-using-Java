/*
#Match Two strings
-Delete unmatched characters inorder to  make strings equal eith minimum efforts!(E1<E2)
-E1 is effort when deleting any character from S1
-E2 is effort when deleting any character from S2
*/
class StringMatchDeleteChar{
    public static void main(String[] args){
        String S1="harbbal";
        String S2="harbar";
        int E1=10;
        int E2=20;
        int effort=getMinimumEffort(S1,S2,E1,E2);
        System.out.println(effort);
    }
    public static int getMinimumEffort(String S1, String S2, int E1, int E2) {
            int cost=0;
            int sizeS1, sizeS2;
            if(S1==S2){
                return 0;//No efforts required!
            }
            else{
                //i for first string and j for second string
                sizeS1 = S1.length();
                sizeS2 = S2.length();
                int i=0, j=0;
                while(i<=(sizeS1-1) & j<=(sizeS2-1))
                {
                    //when match
                    if(S1.charAt(i)==S2.charAt(j)){
                        i++;
                        j++;
                    }
                    else{
                        int I=i, J=j;
                        int counterE1=E1, counterE2=E2;
                        while((I<=(sizeS1-1) & j<=(sizeS2-1)) && (S1.charAt(I)!=S2.charAt(j))){
                            I++;
                            counterE1=counterE1+counterE1;
                        }
                        while((i<=(sizeS1-1) & J<=(sizeS2-1)) && (S1.charAt(i)!=S2.charAt(J))){
                            J++;
                            counterE2=counterE2+counterE2;
                        }
                        if(counterE1<counterE2){
                            i=I;
                            cost=cost+counterE1;
                        }
                        else{
                            j=J;
                            cost=cost+counterE2;
                        }
                    }
                }
            }
        return (cost);
    }  
}
