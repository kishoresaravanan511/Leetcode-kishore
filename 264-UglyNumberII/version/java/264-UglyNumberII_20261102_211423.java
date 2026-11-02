// Last updated: 11/2/2026, 9:14:23 PM
1public class Solution {
2    public int nthUglyNumber(int n) {
3        int[] ugly = new int[n];
4        ugly[0] = 1;
5        int index2 = 0, index3 = 0, index5 = 0;
6        int factor2 = 2, factor3 = 3, factor5 = 5;
7        for(int i=1;i<n;i++){
8            int min = Math.min(Math.min(factor2,factor3),factor5);
9            ugly[i] = min;
10            if(factor2 == min)
11                factor2 = 2*ugly[++index2];
12            if(factor3 == min)
13                factor3 = 3*ugly[++index3];
14            if(factor5 == min)
15                factor5 = 5*ugly[++index5];
16        }
17        return ugly[n-1];
18    }
19}