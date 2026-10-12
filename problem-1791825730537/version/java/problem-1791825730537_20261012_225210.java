// Last updated: 10/12/2026, 10:52:10 PM
1class Solution {
2    public int minimumCost(int[] cost) {
3        int sum = 0;
4        Arrays.sort(cost);
5        int ind = 0;
6        for(int i=cost.length-1;i>=0;i--)
7        {
8            if(ind%3 != 2)
9            {
10                sum+=cost[i];
11            }
12            ind++;
13        }
14        return sum;
15    }
16}