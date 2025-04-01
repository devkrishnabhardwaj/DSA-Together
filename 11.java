// Problem : https://leetcode.com/problems/ugly-number/description/?envType=problem-list-v2&envId=math
class Solution {
    public boolean isUgly(int n) {
        boolean result =true;
        if(n<=0) return false;
        while(n>1){
            if(n%2==0){
                n/=2;
            }
            else if(n%3==0){
                n/=3;
            }
            else if(n%5==0){
                n/=5;
            }
            else{
                result = false;
                break;
            }
        }
        return result;
    }
}
