// Last updated: 9/20/2026, 7:05:43 PM
1class Solution {
2    public boolean judgeSquareSum(int c) {
3        long a = 0;
4        long b = (long)Math.sqrt(c);
5
6        while(a <= b)
7        {
8            long sum = (a*a + b*b);
9            if(sum == c)
10                return true;
11            else if(sum < c)
12                a++;
13            else
14                b--;
15        }
16        return false;
17    }
18}