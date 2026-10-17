// Last updated: 10/17/2026, 6:55:30 PM
1class Solution {
2    public boolean repeatedSubstringPattern(String s) {
3        int n = s.length();
4        for(int i=1;i<=n/2;i++)
5        {
6            if(n%i == 0)
7            {
8                String x = s.substring(0,i);
9                StringBuilder sb = new StringBuilder();
10
11                while(sb.length() < n)
12                {   
13                    sb.append(x);
14                }
15                if(sb.toString().equals(s)) 
16                    return true;
17            }
18        }   
19        return false;     
20    }
21}