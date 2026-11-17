// Last updated: 11/17/2026, 9:46:31 PM
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        int n = nums.length;
4        for(int i=0;i<n;i++)
5        {
6            nums[i] = squaredNum(nums[i]);
7        }
8        Arrays.sort(nums);
9        return nums;
10    }
11    private int squaredNum(int n)
12    {
13        int sq = n*n;
14        return sq;
15    }
16}