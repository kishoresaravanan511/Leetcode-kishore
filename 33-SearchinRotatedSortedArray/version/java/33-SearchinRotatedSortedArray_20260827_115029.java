// Last updated: 8/27/2026, 11:50:29 AM
1class Solution {
2    public int search(int[] nums, int target) {
3        int n = nums.length;
4        int ans = -1;
5
6        for(int i=0;i<n;i++)
7        {
8            if(nums[i] == target)
9            {
10                ans = i;
11            }
12        }
13        return ans;
14    }
15}