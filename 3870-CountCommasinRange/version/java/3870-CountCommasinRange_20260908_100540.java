// Last updated: 9/8/2026, 10:05:40 AM
1class Solution {
2    public int countCommas(int n) {
3        // int c=0;
4        // int temp = n;
5        int ans=0;
6        // while(n!=0)
7        // {
8        //     int r=n%10;
9        //     c++;
10        //     n/=10;
11        // }
12        // if(c>=4)
13        // {
14        //     ans = temp%10;
15        // }
16        ans = n-999;
17        if(ans < 0)
18        {
19            return 0;
20        }
21        return ans;
22    }
23}