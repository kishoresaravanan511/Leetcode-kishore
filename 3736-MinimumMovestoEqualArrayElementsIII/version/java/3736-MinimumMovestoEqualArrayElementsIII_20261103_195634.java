// Last updated: 11/3/2026, 7:56:34 PM
1class Solution {
2    public int minMoves(int[] nums) {
3        int maxNum = Integer.MIN_VALUE;
4        int sum = 0;
5        int n = nums.length;
6        for(int x : nums)
7        {
8            maxNum = Math.max(maxNum,x);
9            sum+=x;
10        }
11        return n * maxNum - sum;
12        // int result = 0;
13        // for(int i=0;i<nums.length;i++)
14        // {
15        //     if(nums[i]!=maxNum)
16        //     {
17        //         result += maxNum - nums[i];
18        //     }
19        //     else
20        //     {
21        //         continue;
22        //     }
23        // }
24        // return result;
25    }
26}