// Problem : https://leetcode.com/problems/maximum-69-number/
class Solution {
    public int maximum69Number (int num) {
        int rev =0;
        boolean flag=true;
        while(num>0){
            rev = rev*10 + num%10;
            num/=10;
        }
        while(rev>0){
            int t = rev%10;
            if(flag && t==6){
                t=9;
                flag = false;
            }
            num = num*10 +t;
            rev/=10;
        }
        return num;
    }
}
