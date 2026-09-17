// Last updated: 9/17/2026, 12:13:31 PM
1class Solution {
2    public String frequencySort(String s) {
3        int n = s.length();
4        Map<Character,Integer> m = new HashMap<>();
5
6        for(int i=0;i<n;i++)
7        {
8            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
9        }
10
11        List<Character> l = new ArrayList<>(m.keySet());
12        l.sort((a,b) -> m.get(b) - m.get(a));
13        StringBuilder sb = new StringBuilder();
14        for(char x : l)
15        {
16            int freq = m.get(x);
17            for(int i=0;i<freq;i++)
18            {
19                sb.append(x);
20            }
21        }
22        return sb.toString();
23    }
24}