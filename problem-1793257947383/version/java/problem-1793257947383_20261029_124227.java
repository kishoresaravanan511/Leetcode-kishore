// Last updated: 10/29/2026, 12:42:27 PM
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        // Map<Integer,Integer> m = new HashMap<>();  //for store the frequencies  - entry point
4        // for(int x : nums)
5        // {
6        //     m.put(x,m.getOrDefault(x,0)+1);
7        // }
8
9        // //why priorityqueue means , we want to find max frequency , by use of pairs
10        // PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b) -> Integer.compare(b.getValue(),a.getValue()));  //descending order
11
12        // for(Map.Entry<Integer,Integer> entry : m.entrySet())
13        //     pq.offer(entry);  //adding to pq
14
15        // int[] ans = new int[k];
16        // for(int i=0;i<k;i++)
17        // {
18        //     ans[i] = pq.poll().getKey();  //w.k.t poll() returns the value, here it returns the entry , in thet we print key only .
19        // }
20        // return ans;
21
22        Map<Integer,Integer> m = new HashMap<>();
23        for(int x:nums)
24        {
25            m.put(x,m.getOrDefault(x,0)+1);
26        }
27        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b) -> Integer.compare(b.getValue(),a.getValue()));   //each entry considered as a and b, and compare values.
28
29        for(Map.Entry<Integer,Integer> entry : m.entrySet())
30        {
31            pq.offer(entry);
32        }
33        int[] ans = new int[k];
34        for(int i=0;i<k;i++)
35        {
36            ans[i] = pq.poll().getKey();
37        }
38        return ans;
39    }
40}