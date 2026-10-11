// Last updated: 10/11/2026, 8:04:22 AM
1class Solution {
2    public int sumOfSquares(int[] nums) {
3        int n = nums.length;
4        int ans = 0;
5        for(int i=1;i<=n;i++)
6        {
7            if(n%i == 0)
8            {
9                ans += nums[i-1] * nums[i-1];
10            }
11        }
12        return ans;
13    }
14}