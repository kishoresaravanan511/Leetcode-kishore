// Last updated: 8/25/2026, 2:48:30 PM
1class Solution {
2    public int missingNumber(int[] nums) {
3        int n = nums.length;
4        int sum = (n*(n+1))/2;
5        int dummy = 0;
6        for(int i=0;i<n;i++)
7        {
8            dummy += nums[i];
9        }
10        return sum-dummy;
11    }
12}