// Last updated: 8/14/2026, 6:34:36 AM
1class Solution {
2    public int maximumLengthSubstring(String s) {
3        int n = s.length();
4        int left =0;
5        Map<Character,Integer> m = new HashMap<>();
6        int maxLen = 0;
7
8        for(int right = 0;right<n;right++)
9        {
10            m.put(s.charAt(right),m.getOrDefault(s.charAt(right),0)+1);
11
12            while(m.get(s.charAt(right)) > 2)
13            {
14                m.put(s.charAt(left),m.getOrDefault(s.charAt(left),0)-1);
15                left++;
16            }
17            maxLen = Math.max(right-left+1,maxLen);
18
19        }
20        return maxLen;
21    }
22}