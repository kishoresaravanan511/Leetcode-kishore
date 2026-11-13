// Last updated: 11/13/2026, 4:24:54 PM
1class Solution {
2    public boolean checkRecord(String s) {
3        int n = s.length();
4        int abs = 0;
5        int late = 0;
6        for(int i=0;i<n;i++)
7        {
8            if(s.charAt(i) == 'A')
9            {
10                abs++;
11                late = 0;
12            }
13            else if(s.charAt(i) == 'L')
14            {
15                late++;
16                if(late == 3)
17                {
18                    return false;
19                }
20            }
21            else
22            {
23                late = 0;
24            }
25        }
26        if(late >= 3 || abs >= 2)
27        {
28            return false;
29        }
30        return true;
31    }
32}