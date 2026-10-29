// Last updated: 10/29/2026, 2:20:23 PM
1class KthLargest {
2    PriorityQueue<Integer> pq = new PriorityQueue<>();
3    int k=0;
4    public KthLargest(int k, int[] nums) { //constructor
5        this.k = k;
6        for(int ele : nums)
7        {
8            if(pq.size() < k){
9                pq.add(ele);
10            }
11            else if(ele > pq.peek()){
12                pq.poll();
13                pq.add(ele);
14            }
15        }
16    }
17    
18    public int add(int val) {
19        if(pq.size() < k)
20            pq.add(val);
21        else if(val > pq.peek())
22        {
23            pq.poll();
24            pq.add(val);
25        }
26        return pq.peek();
27    }
28}
29
30/**
31 * Your KthLargest object will be instantiated and called as such:
32 * KthLargest obj = new KthLargest(k, nums);
33 * int param_1 = obj.add(val);
34 */