// Problem : https://leetcode.com/problems/rotate-array/description/
// time O(n) , space O(k%n)

class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        int arr[] = new int[k];
        for(int i = nums.length-k ,j=0;i<nums.length;i++,j++){
            arr[j]=nums[i];
        }
        for(int i=nums.length-k-1;i>=0;i--){
            nums[i+k]=nums[i];
        }
        for(int i=0;i<k;i++){
            nums[i]=arr[i];
        }
    }
}
