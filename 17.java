// Problem : https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
// time O(n) , space O(1)
class Solution {
    public boolean check(int[] nums) {
        int count =0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                count++;
            }
        }
        if(count<=1) return true;
        return false;
    }
}
