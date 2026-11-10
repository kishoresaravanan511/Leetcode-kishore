// Last updated: 11/10/2026, 12:06:06 PM
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        int n = g.length;
4        Arrays.sort(g);
5        Arrays.sort(s);
6        int i = 0;
7        int j = 0;
8        int count = 0;
9
10        while(i<g.length && j<s.length)
11        {
12            if(s[j]>=g[i])
13            {
14                count++;
15                j++;
16                i++;
17            }
18            else
19            {
20                j++;
21            }
22        }
23        return count;
24    }
25}