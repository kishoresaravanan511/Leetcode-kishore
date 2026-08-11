// Last updated: 8/11/2026, 3:50:14 PM
1class Solution {
2    public int smallestNumber(int n, int t) {
3
4        while(true)
5        {
6            if(productOfANumber(n)%t == 0)
7            {
8                return n;
9            }
10            n++;
11        }
12    }
13    int productOfANumber(int n)
14    {
15        int pro = 1;
16    
17        while(n!=0)
18        {
19            int d = n%10;
20            pro*=d;
21            n/=10;
22
23        }
24        return pro;
25    }
26}
27