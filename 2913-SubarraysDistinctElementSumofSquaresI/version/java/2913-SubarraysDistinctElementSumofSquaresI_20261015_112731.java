// Last updated: 10/15/2026, 11:27:31 AM
1class Solution {
2    public int sumCounts(List<Integer> nums) {
3        int n = nums.size();
4        //Set<Integer> s = new HashSet<>();
5        int ans = 0;
6        for(int i = 0;i<n;i++)
7        {
8            // Set<Integer> s = new HashSet<>();
9            Map<Integer,Integer> m = new HashMap<>();
10            for(int j=i;j<n;j++)
11            {
12                // Map<Integer,Integer> m = new HashMap<>();
13                // Set<Integer> s = new HashSet<>();
14                m.put(nums.get(j),m.getOrDefault(nums.get(j),0)+1);
15                //s.add(nums.get(j));
16                ans += m.size() * m.size();
17            }
18        }
19        return ans;
20    }
21}