// Last updated: 10/12/2026, 10:49:32 PM
1class Solution {
2    public int minimumCost(int[] cost) {
3        int n = cost.length;
4        if(n == 1)  return cost[0];
5        int sum = 0;
6        Arrays.sort(cost);
7        System.out.print(Arrays.toString(cost));
8        int ind = 0;
9        for(int i=n-1;i>=0;i--)
10        {
11            if(ind%3 != 2)
12            {
13                sum+=cost[i];
14            }
15            ind++;
16        }
17        return sum;
18    }
19}