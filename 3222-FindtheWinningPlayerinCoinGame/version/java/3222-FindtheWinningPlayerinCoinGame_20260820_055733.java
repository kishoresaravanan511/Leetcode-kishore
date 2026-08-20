// Last updated: 8/20/2026, 5:57:33 AM
1class Solution {
2    public String winningPlayer(int x, int y) {
3        int c = 0;
4        while(x>0 && y>3)
5        {
6            x-=1;
7            y-=4;
8            c++;
9        }
10        return (c%2==1) ?  "Alice" :  "Bob";
11    }
12}