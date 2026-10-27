// Last updated: 10/27/2026, 6:34:46 PM
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        StringBuilder res = new StringBuilder();
4        StringBuilder sb1 = new StringBuilder();
5    
6        for(int i=0;i<s.length();i++)
7        {
8            if(s.charAt(i) != '-')
9                sb1.append(Character.toUpperCase(s.charAt(i)));
10        }
11        int n = sb1.length();
12        int first = n%k;
13        int x = 0;
14
15        if(first > 0)
16        {
17            res.append(sb1.substring(0,first));
18            x = first;
19        } 
20        while(x < n)
21        {
22            if(res.length() > 0)
23            {
24                res.append("-");
25            }
26            res.append(sb1.substring(x,x+k));
27            x+=k;
28        }
29        return res.toString();
30    }
31}