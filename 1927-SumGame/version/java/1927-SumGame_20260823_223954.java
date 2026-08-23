// Last updated: 8/23/2026, 10:39:54 PM
1class Solution {
2    public boolean sumGame(String num) {
3       int n = num.length();
4       double ans = 0.0;
5
6       for(int i=0;i<n/2;i++)
7       {
8            ans+=helper(num.charAt(i));
9       } 
10       for(int i=n/2;i<n;i++)
11       {
12            ans-=helper(num.charAt(i));
13       }
14       return ans != 0.0;
15    }
16    double helper(char c)
17    {
18        return (c=='?') ? 4.5 : c-'0';
19    }
20}