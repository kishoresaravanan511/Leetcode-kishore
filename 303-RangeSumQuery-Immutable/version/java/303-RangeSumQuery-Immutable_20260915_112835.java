// Last updated: 9/15/2026, 11:28:35 AM
1class Solution {
2    public int[] runningSum(int[] nums) {
3        int n = nums.length;
4        int[] prefix = new int[n];
5        prefix[0] = nums[0];
6
7        for(int i=1;i<n;i++)
8        {
9            prefix[i] = nums[i] + prefix[i-1];
10        }
11
12        return prefix;
13    }
14}