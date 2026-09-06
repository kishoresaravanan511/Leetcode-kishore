// Last updated: 9/6/2026, 8:45:45 AM
1class Solution {
2    public int countRotations(String s, int k) {
3        int n = s.length();
4        int c=0;
5
6        // if(n==1)
7        // {
8        //     return k==0 ? 1 : 0;
9        // }
10
11        for(int i=0;i<n;i++)
12        {
13            if(s.charAt(i) == s.charAt((i+1) %n))
14            {
15                c++;
16            }
17        }
18        if(k==c)
19        {
20            return n-c;
21        }
22        if(k==c-1)
23        {
24            return c;
25        }
26        return 0;
27    }
28}