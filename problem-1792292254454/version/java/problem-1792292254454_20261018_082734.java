// Last updated: 10/18/2026, 8:27:34 AM
1class Solution {
2    public int minDeletions(int[] nums) {
3        int n = nums.length;
4        int count = 0;
5        int prev = nums[0];
6        for(int i=1;i<n;i++)
7        {
8            if(nums[i-1] == nums[i])
9            {
10                count++;
11            }
12            // else
13            // {
14            //     prev = nums[i];
15            // }
16        }
17        return count;
18    }
19}