// Last updated: 11/13/2026, 4:36:49 PM
1class Solution {
2    public String toLowerCase(String s) {
3        int n = s.length();
4        StringBuilder res = new StringBuilder();
5        for(char c : s.toCharArray())
6        {
7            int x = (int)c;
8            if(x <= 90  && x >= 65)
9                res.append((char)(x+32));
10            else
11                res.append(c);
12        }
13        return res.toString();
14    }
15}