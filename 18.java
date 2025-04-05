// problem : https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
// time O(n) , space O(1) 
class Solution {
    public int removeDuplicates(int[] nums) {
        int l=0,r=1,count=1;
        while(r<nums.length){
            if(nums[l]!=nums[r] || count<2){
                nums[l+1] = nums[r];
            }
            if(nums[l]==nums[r]){
                count++;
            }
            else{
                count =1;
            }
            if(count<=2)
                l++;
            r++;
        }
        return l+1;
    }
}
