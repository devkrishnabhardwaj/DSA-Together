// problem : https://leetcode.com/problems/search-insert-position/
class Solution {
    public int searchInsert(int[] nums, int target) {
        int lb=nums.length;
        int low = 0,high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]>=target){
                lb=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return lb;
    }
}
