// Last updated: 8/25/2026, 2:37:46 PM
1class Solution {
2    public int missingMultiple(int[] nums, int k) {
3        Set<Integer> s = new HashSet<>();
4        for(int x : nums)
5        {
6            s.add(x);
7        }
8        for(int i=1;i<=nums.length+1;i++)
9        {
10            if(!s.contains(k*i))
11            {
12                return k*i;
13            }
14        }
15        return -1;
16    }
17}