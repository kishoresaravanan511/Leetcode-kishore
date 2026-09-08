// Last updated: 9/8/2026, 10:11:28 AM
1class Solution {
2    public int countCommas(int n) {
3        // int ans = 0;
4        // ans = n-999;
5        // if(ans < 0)
6        // {
7        //     return 0;
8        // }
9        // return ans;
10
11        // if(n < 999) return 0;
12        // return n-999;
13
14        return (n<999) ? 0 : n-999;
15    }
16}