// Last updated: 9/12/2026, 2:12:09 PM
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        // String res = "";
4        // Arrays.sort(strs);   //o(nlogn)
5        // String fi = strs[0];
6        // String lt = strs[strs.length-1];
7
8        // for(int i=0;i<fi.length();i++)
9        // {
10        //     if(fi.charAt(i) == lt.charAt(i))
11        //     {
12        //         res+=fi.charAt(i);
13        //     }
14        //     else
15        //     {
16        //         break;
17        //     }
18        // }
19        // return res;
20
21
22
23        String prefix = strs[0];
24        for(int i=1;i<strs.length;i++)
25        {
26            while(!strs[i].startsWith(prefix))
27            {
28                prefix = prefix.substring(0,prefix.length()-1);
29            }
30            if(prefix.equals(""))
31            {
32                return "";
33            }
34        }
35        return prefix;
36    }
37}