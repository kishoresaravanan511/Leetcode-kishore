// Last updated: 8/11/2026, 2:19:32 PM
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Map<Integer,Integer> m = new HashMap<>();  //for store the frequencies  - entry point
        // for(int x : nums)
        // {
        //     m.put(x,m.getOrDefault(x,0)+1);
        // }

        // //why priorityqueue means , we want to find max frequency , by use of pairs
        // PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b) -> Integer.compare(b.getValue(),a.getValue()));  //descending order

        // for(Map.Entry<Integer,Integer> entry : m.entrySet())
        //     pq.offer(entry);  //adding to pq

        // int[] ans = new int[k];
        // for(int i=0;i<k;i++)
        // {
        //     ans[i] = pq.poll().getKey();  //w.k.t poll() returns the value, here it returns the entry , in thet we print key only .
        // }
        // return ans;

        Map<Integer,Integer> m = new HashMap<>();
        for(int x:nums)
        {
            m.put(x,m.getOrDefault(x,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b) -> Integer.compare(b.getValue(),a.getValue()));

        for(Map.Entry<Integer,Integer> entry : m.entrySet())
        {
            pq.offer(entry);
        }
        int[] ans = new int[k];
        for(int i=0;i<k;i++)
        {
            ans[i] = pq.poll().getKey();
        }
        return ans;
    }
}