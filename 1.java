// Problem : https://www.geeksforgeeks.org/problems/count-numbers-divisible-by-m1524/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card


class Solution {
    static int countDivisibles(int A, int B, int M){
        // code here
        int a;
        if(A%M==0) a=A;
        else a = A + ((A<M)?(M-A):(M-A%M ));
        int b = B - B%M;
        
        int c = (b-a)/M +1;
    
        return c;
        
    }
}
