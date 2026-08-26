// Last updated: 8/26/2026, 3:26:31 PM
1class Solution {
2    public void moveZeroes(int[] nums) {
3       int p1 = 0;
4       for(int p2 = 0;p2<nums.length;p2++)
5       {
6            if(nums[p2]!=0)
7            {
8                int temp = nums[p1];
9                nums[p1] = nums[p2];
10                nums[p2] = temp;
11                p1++;
12            }
13       } 
14    }
15}