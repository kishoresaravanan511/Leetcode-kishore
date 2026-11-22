// Last updated: 11/22/2026, 8:27:22 AM
1class Solution {
2    public boolean checkString(String s) {
3        int n = s.length();
4        boolean isB = false;
5
6        for(char c : s.toCharArray())
7        {
8            if(c == 'b')
9            {
10                isB = true;
11            }
12            else
13            {
14                if(isB)
15                {
16                    return false;
17                } 
18            }
19        }
20        return true;
21    }
22}