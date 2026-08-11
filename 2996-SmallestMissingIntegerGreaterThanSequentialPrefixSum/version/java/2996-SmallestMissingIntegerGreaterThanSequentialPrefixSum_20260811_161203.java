// Last updated: 8/11/2026, 4:12:03 PM
1class Solution {
2    public int maxIceCream(int[] costs, int coins) {
3        Arrays.sort(costs);
4        int c=0;
5        for(int x : costs)
6        {
7            if(x > coins)
8            {
9                break;
10            }
11            else
12            {
13                coins-=x;
14                c++;
15            }
16        }
17        return c;
18    }
19}