// Last updated: 8/11/2026, 3:49:41 PM
1class Solution {
2    public int smallestNumber(int n, int t) {
3
4        while(true)
5        {
6            int product = productOfANumber(n);
7            if(product%t == 0)
8            {
9                return n;
10            }
11            n++;
12        }
13    }
14    int productOfANumber(int n)
15    {
16        int pro = 1;
17    
18        while(n!=0)
19        {
20            int d = n%10;
21            pro*=d;
22            n/=10;
23
24        }
25        return pro;
26    }
27}
28