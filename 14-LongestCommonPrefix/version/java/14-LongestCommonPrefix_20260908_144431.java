// Last updated: 9/8/2026, 2:44:31 PM
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
24        int n = strs.length;
25        for(int i=1;i<n;i++)
26        {
27            while(!strs[i].startsWith(prefix))
28            {
29                prefix = prefix.substring(0,prefix.length()-1);
30            }
31            if(prefix.equals(""))
32            {
33                return "";
34            }
35        }
36        return prefix;
37    }
38}