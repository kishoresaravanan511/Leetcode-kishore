// Last updated: 8/16/2026, 9:13:09 AM
1class Solution {
2    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
3        int n = arrivalTime.length;
4        int maxLight = 0;
5
6        for(int x:lights)
7            {
8                maxLight = Math.max(maxLight,x);
9            }
10
11            int maxWait = 0;
12        for(int x : arrivalTime)
13            {
14                int r=x%period;
15                int wait;
16
17                if(r<maxLight)
18                {
19                    wait = 0;
20                }
21                else
22                {
23                    wait = period-r;
24                }
25
26                maxWait = Math.max(maxWait,wait);
27            }
28        return maxWait;
29    }
30}