// Last updated: 8/25/2026, 7:17:11 PM
1class Solution {
2    public int largestInteger(int[] nums, int k) {
3        Map<Integer,Integer> m = new HashMap<>();
4        for(int i=0;i<=nums.length-k;i++)
5        {
6            Set<Integer> s = new HashSet<>();
7            for(int j=i;j<k+i;j++)
8            {
9                s.add(nums[j]);
10            }
11            for(int x : s)
12            {
13                m.put(x,m.getOrDefault(x,0)+1);
14            }
15        }
16        int max = -1;
17        for(int x : m.keySet())
18        {
19            if(m.get(x) == 1)
20            {
21                max = Math.max(max,x);
22            }
23        }
24        return max;
25        
26    }
27}