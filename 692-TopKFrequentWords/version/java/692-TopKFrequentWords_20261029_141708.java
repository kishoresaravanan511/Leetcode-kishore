// Last updated: 10/29/2026, 2:17:08 PM
1class Solution {
2    public List<String> topKFrequent(String[] words, int k) {
3        Map<String,Integer> m = new HashMap<>();
4        for(String s : words)
5        {
6            m.put(s,m.getOrDefault(s,0)+1);
7        }
8
9        Comparator<Map.Entry<String,Integer>> com = new Comparator<>()
10        {
11            @Override
12            public int compare(Map.Entry<String,Integer> a, Map.Entry<String,Integer> b)
13            {
14                //values of entryset in descending
15                if(!a.getValue().equals(b.getValue()))
16                {
17                    return Integer.compare(b.getValue(),a.getValue());
18                }
19                //if values are equal , then sort in alphabetical order in ascending
20                return a.getKey().compareTo(b.getKey());
21            }
22        };
23
24        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>(com);
25        for(Map.Entry<String,Integer> entry : m.entrySet())
26        {
27            pq.offer(entry);
28        }
29       
30        List<String> ans = new ArrayList<>();
31        for(int i=0;i<k;i++)
32        {
33            ans.add(pq.poll().getKey());
34        }
35        return ans;
36    }
37}