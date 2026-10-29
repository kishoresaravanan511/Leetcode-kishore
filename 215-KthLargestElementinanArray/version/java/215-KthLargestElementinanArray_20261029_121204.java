// Last updated: 10/29/2026, 12:12:04 PM
1public class Solution {
2    public int findKthLargest(int[] nums, int k) {
3        
4        //1st approach O(n2)
5
6        //  PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
7        //  for(int x:nums)
8        //  {
9        //     pq.add(x);
10        //  }
11        //  for(int i=1;i<k;i++)
12        //  {
13        //     pq.poll(); 
14        //  }
15        //  return pq.poll();
16
17
18        //2nd approach O(n)
19        PriorityQueue<Integer> pq = new PriorityQueue<>();   //ascending order   //for descending Collections.reverseOrder()
20        // for(int x : nums)
21        // {
22        //     if(pq.size() < k){   //for every first k size elements push to pq
23        //         pq.add(x);  //offer or add methods
24        //     }
25        //     else if(x > pq.peek()){  //if incoming element greater than exist element delete that and add new incoming element  and peek is the starting number i.e high priority ascending order 1st element.
26        //         pq.poll();  //remove the first element 
27        //         pq.add(x); //add to the last.
28        //     }
29        // }
30        // return pq.peek();   //return peekest element.
31
32        for(int x : nums) {
33            if (pq.size() < k)
34            {
35                pq.add(x);
36            }
37            else if(x > pq.peek())
38            {
39                pq.poll();
40                pq.offer(x);
41            }
42        }
43        return pq.poll();
44    }
45}