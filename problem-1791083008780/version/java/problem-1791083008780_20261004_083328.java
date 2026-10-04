// Last updated: 10/4/2026, 8:33:28 AM
1class Solution {
2    public int minRotations(String s) {
3        int ans = 0;
4        char c = '0';
5        char from = '0';
6        for(int i=0;i<10;i++)
7        {
8            char To = s.charAt(i);
9            int need = Math.abs((int)from - (int)To);
10            if(need < 5)
11            {
12                ans+=need;
13            }
14            else
15            {
16                ans = ans + (10 - need); 
17            }
18            from = s.charAt(i);
19        }
20        return ans;
21    }
22}