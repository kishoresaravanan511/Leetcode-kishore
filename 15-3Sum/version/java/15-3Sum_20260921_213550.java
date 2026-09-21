// Last updated: 9/21/2026, 9:35:50 PM
1class Solution {
2    public int removeElement(int[] nums, int val) {
3        int k=0;
4
5        for(int i=0;i<nums.length;i++)
6        {
7            if(nums[i] != val)
8            {
9                nums[k] = nums[i];
10                k++;
11            }
12        }
13        return k;
14        
15    }
16}