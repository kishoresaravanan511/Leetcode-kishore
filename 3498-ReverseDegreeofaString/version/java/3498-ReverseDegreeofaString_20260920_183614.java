// Last updated: 9/20/2026, 6:36:14 PM
1class Solution {
2    public int reverseDegree(String s) {
3        int n = s.length();
4        Map<Character,Integer> m = new HashMap<>();
5        int val = 26;
6        char ch = 'a';
7        int ans = 0;
8        for(int i=0;i<26;i++)
9        {
10            m.put(ch,val);
11            ch++;
12            val--;
13        }
14        System.out.print(m);
15        int ind=1;
16        for(int i=0;i<n;i++)
17        {
18            ans += m.get(s.charAt(i))*ind;
19            ind++;
20        }
21        return ans;
22    }
23}