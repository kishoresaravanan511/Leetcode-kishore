// Last updated: 10/15/2026, 11:46:13 AM
1class Solution {
2    public int sumCounts(List<Integer> nums) {
3        int n = nums.size();
4        Set<Integer> s = new HashSet<>();
5        int ans = 0;
6        for(int i = 0;i<n;i++)
7        {
8            for(int j=i;j<n;j++)
9            {
10                s.add(nums.get(j));
11                ans += s.size() * s.size();
12            }
13            s.clear();
14        }
15        return ans;
16    }
17}