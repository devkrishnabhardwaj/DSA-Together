//problem :https://leetcode.com/problems/power-of-three/
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<1) return false;
        boolean flag = false;
        while(n%3==0){
            n=n/3;
        }
        if(n==1) flag=true;

        return flag;
    }
}
