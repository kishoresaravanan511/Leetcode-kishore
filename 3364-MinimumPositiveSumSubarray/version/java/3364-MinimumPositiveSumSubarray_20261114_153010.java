// Last updated: 11/14/2026, 3:30:10 PM
1class Solution {
2    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
3        int size = nums.size();
4        int minSum = Integer.MAX_VALUE;
5    
6        for(int i=0;i<size;i++)
7        {
8            int sum = 0;
9            for(int j=i;j<size;j++)
10            {
11                int n = j-i+1;
12                sum += nums.get(j);
13                if(sum > 0 && n >= l && n <= r)
14                {
15                    minSum = Math.min(minSum,sum);
16                }
17            }
18        }
19        if(minSum == Integer.MAX_VALUE) return -1;
20        return minSum;
21    }
22}