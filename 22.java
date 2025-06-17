// Problem : https://leetcode.com/problems/maximum-difference-between-increasing-elements/description/

// time O(n^2)
class Solution {
    public int maximumDifference(int[] nums) {
        int maxD = -1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int diff = nums[j]-nums[i];
                if(diff>0 && diff>maxD) maxD = diff;
            }
        }
        return maxD;
    }
}

// time O(n)
class Solution2 {
    public int maximumDifference(int[] nums) {
        int min =nums[0],maxD=-1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=min){
                min = nums[i];
                continue;
            }
            int diff = nums[i]-min;
            if(diff>maxD){
                maxD = diff;
            }
        }
        return maxD;
    }
}
