// Last updated: 11/28/2026, 8:55:21 PM
1class Solution {
2    public int divisorSubstrings(int num, int k) {
3        int c = 0;
4        String s = String.valueOf(num);
5        int dig = s.length();
6        for(int i=0;i<=dig-k;i++)
7        {
8            String str = s.substring(i,i+k);
9            int val = Integer.parseInt(str);
10
11            if(val != 0 && num % val == 0)
12            {
13                c++;
14            }
15        }
16        return c++;
17    }
18}