// Last updated: 11/26/2026, 5:30:28 PM
1class Solution {
2    public List<Integer> findDuplicates(int[] nums) {
3        int n = nums.length;
4        List<Integer> l = new ArrayList<>();
5        // Map<Integer,Integer> m = new HashMap<>();
6        // for(int x : nums)
7        // {
8        //     m.put(x,m.getOrDefault(x,0)+1);
9        // }
10        // for(Map.Entry<Integer,Integer> entry : m.entrySet())
11        // {
12        //     if(entry.getValue() > 1){
13        //         l.add(entry.getKey());
14        //     }
15        // }
16        // return l;
17        Set<Integer> s = new HashSet<>();
18        for(int x : nums)
19        {
20            if(!s.contains(x))
21            {
22                s.add(x);
23            }
24            else
25            {
26                l.add(x);
27            }
28        }
29        return l;
30    }
31}