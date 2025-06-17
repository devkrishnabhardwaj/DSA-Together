// Problem : https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

class Solution {
  
    int count1(int n){
        int i=0;
        while(n>0){
            i++;
            n/=10;
        }
        return i;
    }
    // Second approach of count Method
    int count2(int n){
        return (int)(Math.log10(n)+1);
    }
  
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i:nums){
            if(count1(i)%2==0) count++;
        }
        return count;
    }
}
