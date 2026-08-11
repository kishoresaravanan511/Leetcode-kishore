// Last updated: 8/11/2026, 2:20:09 PM
class Solution {
    public void moveZeroes(int[] nums) {
       int p1 = 0;
       for(int p2 = 0;p2<nums.length;p2++)
       {
        if(nums[p2]!=0)
        {
            int temp = nums[p1];
            nums[p1] = nums[p2];
            nums[p2] = temp;
            p1++;
        }
       } 
    }
}