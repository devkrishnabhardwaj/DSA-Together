// Problem : https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/1493482586/
class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0, temp[]= new int[nums.length];
        temp[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            if(temp[count]==nums[i]) continue;

            count++;
            temp[count]=nums[i];
        }
        for(int i=0;i<=count;i++){
            nums[i]=temp[i];
        }
        return count+1;
        
    }
}
