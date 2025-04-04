// Problem : https://leetcode.com/problems/product-of-array-except-self/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] pre = new int[nums.length];
        int [] suff = new int[nums.length];
        pre[0] = 1;
        suff[nums.length-1] = 1;

        for(int i=1;i<nums.length;i++){
            pre[i] = pre[i-1] * nums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            suff[i] = suff[i+1] * nums[i+1];
        }

        int [] res = new int[nums.length];

        for(int i=0;i<res.length;i++){
            res[i] = pre[i] * suff[i];
        }

        return res;
    }
}
