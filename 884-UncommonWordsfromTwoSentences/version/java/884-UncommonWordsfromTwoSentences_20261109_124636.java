// Last updated: 11/9/2026, 12:46:36 PM
1class Solution {
2    public String[] uncommonFromSentences(String s1, String s2) {
3        Map<String,Integer> m = new HashMap<>();
4        List<String> l = new ArrayList<>();
5        for(String a : s1.split(" "))
6        {
7            m.put(a,m.getOrDefault(a,0)+1);
8        }
9        for(String b : s2.split(" "))
10        {
11            m.put(b,m.getOrDefault(b,0)+1);
12        }
13        for(Map.Entry<String,Integer> entry : m.entrySet())
14        {
15            if(entry.getValue() == 1)
16            {
17                l.add(entry.getKey());
18            }
19        }
20        String[] arr = new String[l.size()];
21        for(int i=0;i<arr.length;i++)
22        {
23            arr[i] = l.get(i);
24        }
25        return arr;
26    }
27}