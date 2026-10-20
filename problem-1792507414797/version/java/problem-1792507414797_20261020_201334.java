// Last updated: 10/20/2026, 8:13:34 PM
1class Solution {
2    public List<Integer> targetIndices(int[] nums, int target) {
3        int n = nums.length;
4        List<Integer> l = new ArrayList<>();
5        Arrays.sort(nums);
6        for(int i=0;i<n;i++)
7        {
8            if(nums[i] == target)
9            {
10                l.add(i);
11            }
12        }
13        return l;
14    }
15}