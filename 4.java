//problem: https://leetcode.com/problems/third-maximum-number/description/

class Solution {
    public int thirdMax(int[] nums) {
        int a=Integer.MIN_VALUE,b=Integer.MIN_VALUE,c=Integer.MIN_VALUE;
        boolean flag = false;
        for(int i=0;i<nums.length;i++){
            if(a<=nums[i]) a=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==a) continue;
            if(nums[i]>=b) b = nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==a || nums[i]==b){
                continue;
            }
            if(nums[i]>=c){
                c=nums[i];
                flag=true;
            }   
        }
        if(flag) return c;
        return a;
    }
}
