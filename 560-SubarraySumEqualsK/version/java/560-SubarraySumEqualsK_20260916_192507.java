// Last updated: 9/16/2026, 7:25:07 PM
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        int n = nums.length;
4        Map<Integer,Integer> m = new HashMap<>();
5        m.put(0,1);
6
7        int c=0;
8        int sum=0;
9
10        for(int i=0;i<n;i++)
11        {
12            sum+=nums[i];
13            int req = sum - k;
14
15            if(m.containsKey(req))
16            {
17                c+=m.get(req);
18            }
19            m.put(sum,m.getOrDefault(sum,0)+1);
20        }
21        return c;
22    }
23}