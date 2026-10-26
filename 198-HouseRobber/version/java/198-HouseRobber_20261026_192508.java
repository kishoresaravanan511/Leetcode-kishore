// Last updated: 10/26/2026, 7:25:08 PM
1class Solution {
2    public int rob(int[] nums) {
3        int[] dp = new int[nums.length];
4        int n = nums.length;
5
6        if(nums.length==1)  return nums[0];
7
8        dp[0] = nums[0];  //for only 1 house
9        dp[1] = Math.max(nums[0],nums[1]); //for two houses  max is answer
10
11        for(int i=2;i<n;i++)
12        {
13            dp[i] = Math.max(dp[i-2] +nums[i],dp[i-1]);  //draw timeline for better understanding
14        }
15        return dp[n-1];
16    }
17}