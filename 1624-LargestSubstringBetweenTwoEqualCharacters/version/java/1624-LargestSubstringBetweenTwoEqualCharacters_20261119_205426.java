// Last updated: 11/19/2026, 8:54:26 PM
1class Solution {
2    public int maxLengthBetweenEqualCharacters(String s) {
3        Map<Character,Integer> m = new HashMap<>();
4        int max = -1;
5
6        for(int i=0;i<s.length();i++)
7        {
8            char ch = s.charAt(i);
9
10            if(!m.containsKey(ch))
11            {
12                m.put(ch,i);
13            }
14            else
15            {
16                max = Math.max(max,i-m.get(ch) - 1); //important
17            }
18        }
19        return max;
20    }
21}