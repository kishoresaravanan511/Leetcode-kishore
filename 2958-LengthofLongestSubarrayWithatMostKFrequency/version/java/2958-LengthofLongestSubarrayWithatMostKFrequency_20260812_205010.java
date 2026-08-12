// Last updated: 8/12/2026, 8:50:10 PM
1class Solution {
2    public int maxSubarrayLength(int[] nums, int k) {
3        int n = nums.length;
4        int maxLen = 0;
5        Map<Integer,Integer> m = new HashMap<>();
6        int i=0;
7
8        for(int j=0;j<n;j++)
9        {
10            m.put(nums[j],m.getOrDefault(nums[j],0)+1);
11
12            while(m.get(nums[j]) > k)
13            {
14                m.put(nums[i],m.getOrDefault(nums[i],0)-1);
15                i++;
16            }
17            maxLen = Math.max(j-i+1,maxLen);
18        }
19        return maxLen;
20    }
21}