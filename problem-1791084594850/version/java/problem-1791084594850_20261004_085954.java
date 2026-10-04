// Last updated: 10/4/2026, 8:59:54 AM
1class Solution {
2    public int minRotations(String s) {
3        int ans = 0;
4        char from = '0';
5        for(int i=0;i<10;i++)
6        {
7            char to = s.charAt(i);
8            int need = Math.abs((int)from - (int)to);
9            if(need < 5)
10            {
11                ans+=need;
12            }
13            else
14            {
15                ans = ans + (10 - need); 
16            }
17            from = s.charAt(i);
18        }
19        return ans;
20    }
21}