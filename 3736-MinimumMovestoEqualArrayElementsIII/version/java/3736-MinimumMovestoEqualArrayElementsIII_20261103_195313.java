// Last updated: 11/3/2026, 7:53:13 PM
1class Solution {
2    public int minMoves(int[] nums) {
3        int maxNum = Integer.MIN_VALUE;
4        for(int x : nums)
5        {
6            maxNum = Math.max(maxNum,x);
7        }
8        int result = 0;
9        for(int i=0;i<nums.length;i++)
10        {
11            if(nums[i]!=maxNum)
12            {
13                result += maxNum - nums[i];
14            }
15            else
16            {
17                continue;
18            }
19        }
20        return result;
21    }
22}