// Last updated: 11/17/2026, 6:24:37 PM
1class Solution {
2    public String digitSum(String s, int k) {
3        
4        while(s.length() > k)
5        {
6            StringBuilder sb = new StringBuilder();
7            for(int i=0;i<s.length();i+=k)
8            {
9                String str = s.substring(i,Math.min(i+k,s.length()));
10                int sum = sumOfString(str);
11                sb.append(sum);
12            }
13            s = String.valueOf(sb);
14        }
15        return s;
16    }
17    private int sumOfString(String s)
18    {
19        int sum = 0;
20        for(int i=0;i<s.length();i++)
21        {
22            sum+=s.charAt(i)-'0';
23        }
24        return sum;
25    }
26}