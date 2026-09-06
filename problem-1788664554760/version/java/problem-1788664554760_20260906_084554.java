// Last updated: 9/6/2026, 8:45:54 AM
1class Solution {
2    public int countRotations(String s, int k) {
3        int n = s.length();
4        int c=0;
5
6        for(int i=0;i<n;i++)
7        {
8            if(s.charAt(i) == s.charAt((i+1) %n))
9            {
10                c++;
11            }
12        }
13        if(k==c)
14        {
15            return n-c;
16        }
17        if(k==c-1)
18        {
19            return c;
20        }
21        return 0;
22    }
23}