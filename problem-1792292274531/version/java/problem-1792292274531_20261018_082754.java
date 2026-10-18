// Last updated: 10/18/2026, 8:27:54 AM
1class Solution {
2    public int minDeletions(int[] nums) {
3        int n = nums.length;
4        int count = 0;
5        for(int i=1;i<n;i++)
6        {
7            if(nums[i-1] == nums[i])
8            {
9                count++;
10            }
11        }
12        return count;
13    }
14}