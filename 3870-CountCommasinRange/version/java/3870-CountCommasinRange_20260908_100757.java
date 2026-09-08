// Last updated: 9/8/2026, 10:07:57 AM
1class Solution {
2    public int countCommas(int n) {
3        // int ans = 0;
4        // ans = n-999;
5        // if(ans < 0)
6        // {
7        //     return 0;
8        // }
9        // return ans;
10        if(n < 999) return 0;
11        return n-999;
12    }
13}