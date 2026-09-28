// Last updated: 9/28/2026, 9:28:41 PM
1class Solution {
2    public int maxDepth(String s) {
3        int c = 0;
4        int max = 0;
5        for(char ch : s.toCharArray())
6        {
7                if(ch == '(')
8                {
9                    c++;
10                    
11                    max = Math.max(max,c);
12                }
13                else if(ch == ')')
14                {
15                    c--;
16                }
17        }
18        return max;
19    }
20}