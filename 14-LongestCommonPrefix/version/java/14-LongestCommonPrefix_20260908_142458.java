// Last updated: 9/8/2026, 2:24:58 PM
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        String res = "";
4        Arrays.sort(strs);
5        String fi = strs[0];
6        String lt = strs[strs.length-1];
7
8        for(int i=0;i<fi.length();i++)
9        {
10            if(fi.charAt(i) == lt.charAt(i))
11            {
12                res+=fi.charAt(i);
13            }
14            else
15            {
16                break;
17            }
18        }
19        return res;
20    }
21}