// Last updated: 8/30/2026, 1:01:48 PM
1class Solution {
2    public int largestInteger(int[] nums, int k) {
3        Map<Integer,Integer> m = new HashMap<>();
4        //fixed size window  o(n^2)
5        for(int i=0;i<=nums.length-k;i++)
6        {
7            Set<Integer> s = new HashSet<>();
8            for(int j=i;j<k+i;j++)
9            {
10                s.add(nums[j]);
11            }
12            for(int x : s)
13            {
14                m.put(x,m.getOrDefault(x,0)+1);
15            }
16        }
17        int max = -1;
18        for(int x : m.keySet()) //only fetch the key of the map   ->  keySet()
19        {
20            if(m.get(x) == 1)
21            {
22                max = Math.max(max,x);
23            }
24        }
25        return max;
26        
27    }
28}