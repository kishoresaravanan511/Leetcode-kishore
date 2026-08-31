// Last updated: 8/31/2026, 7:48:39 PM
1class Solution {
2    public int missingNumber(int[] nums) {
3        int n = nums.length;
4        int sum = (n*(n+1))/2;
5        int numsSum = 0;
6        for(int i=0;i<n;i++)
7        {
8            numsSum += nums[i];
9        }
10        return sum-numsSum;
11    }
12}