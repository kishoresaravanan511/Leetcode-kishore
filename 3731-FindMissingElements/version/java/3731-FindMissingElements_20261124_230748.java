// Last updated: 11/24/2026, 11:07:48 PM
1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        // int n=nums.length;
4        int max = Integer.MIN_VALUE;
5        int min = Integer.MAX_VALUE;
6        List<Integer> ans = new ArrayList<>();
7        Set<Integer> s = new HashSet<>();
8        for(int x : nums)
9        {
10            if(x>max)
11            {
12                max = x;
13            }
14            if(x<min)
15            {
16                min = x;
17            }
18            s.add(x);
19        }
20        for(int i=min+1;i<max;i++)
21        {
22            if(!s.contains(i))
23            {
24                ans.add(i);
25            }
26        }
27        return ans;
28    }
29}