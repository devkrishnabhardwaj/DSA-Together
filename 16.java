// Problem : https://leetcode.com/problems/majority-element/
// time : O(n) space : O(1)

class Solution {
    public int majorityElement(int[] nums) {
        int E = 0;
        int count = 0;
        
        for(int i=0;i<nums.length;i++){
            if(count == 0){
                E = nums[i];
                count = 1;
            }
            else if(E==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        count =0;
        for(int i=0;i<nums.length;i++){
            if(E==nums[i]) count++;
        }
        if(count> nums.length/2){
            return E;
        }
        return -1;
    }
}
