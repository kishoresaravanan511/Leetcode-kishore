// Last updated: 9/24/2026, 9:53:25 PM
1class Solution {
2    public boolean isSubsequence(String s, String t) {
3        int p1 = 0;
4        int p2 = 0;
5
6        while(p1 < s.length() && p2 < t.length())
7        {
8            if(s.charAt(p1) == t.charAt(p2)) 
9            {   
10                p1++;
11            }
12            p2++;
13        }
14
15        return p1 == s.length();
16    }
17}