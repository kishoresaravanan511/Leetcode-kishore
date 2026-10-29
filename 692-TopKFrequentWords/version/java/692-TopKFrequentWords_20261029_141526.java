// Last updated: 10/29/2026, 2:15:26 PM
1class Solution {
2    public List<String> topKFrequent(String[] words, int k) {
3        Map<String,Integer> m = new HashMap<>();
4        for(String s : words)
5        {
6            m.put(s,m.getOrDefault(s,0)+1);
7        }
8
9         Comparator<Map.Entry<String,Integer>> com = new Comparator<>()
10        {
11            @Override
12            public int compare(Map.Entry<String,Integer> i, Map.Entry<String,Integer> j)
13            {
14                if(!i.getValue().equals(j.getValue()))
15                {
16                    return Integer.compare(j.getValue(),i.getValue());
17                }
18                return i.getKey().compareTo(j.getKey());
19            }
20        };
21
22        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>(com);
23        for(Map.Entry<String,Integer> entry : m.entrySet())
24        {
25            pq.offer(entry);
26        }
27       
28        List<String> ans = new ArrayList<>();
29        for(int i=0;i<k;i++)
30        {
31            ans.add(pq.poll().getKey());
32        }
33        return ans;
34    }
35}