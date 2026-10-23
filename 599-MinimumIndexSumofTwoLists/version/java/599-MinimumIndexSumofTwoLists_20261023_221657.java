// Last updated: 10/23/2026, 10:16:57 PM
1class Solution {
2    public String[] findRestaurant(String[] list1, String[] list2) {
3        Map<String,Integer> m = new HashMap<>();
4        Map<String,Integer> m1 = new HashMap<>();
5        List<String> l = new ArrayList<>();
6
7        for(int i=0;i<list1.length;i++)
8        {
9            m.put(list1[i],i);
10        }
11        for(int i=0;i<list2.length;i++)
12        {
13            m1.put(list2[i],i);
14        }
15        int need = 0;
16        int min = Integer.MAX_VALUE;
17        for(String s : m.keySet())
18        {
19            if(m1.containsKey(s))
20            {
21                need = m.get(s) + m1.get(s);
22
23                if(need < min)
24                {
25                    min = need;
26                    l.clear();
27                    l.add(s);
28                }
29                else if(min == need)
30                {
31                    l.add(s);
32                }
33            }
34        }
35        return l.toArray(new String[0]);
36    }
37}