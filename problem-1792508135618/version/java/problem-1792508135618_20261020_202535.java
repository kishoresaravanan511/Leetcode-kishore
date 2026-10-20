// Last updated: 10/20/2026, 8:25:35 PM
1class Solution {
2    public List<Integer> targetIndices(int[] nums, int target) {
3        int n = nums.length;
4        List<Integer> l = new ArrayList<>();
5        Arrays.sort(nums);
6        int low = 0;
7        int high = n-1;
8        for(int i=0;i<n;i++)
9        {
10            if(nums[i] == target)
11            {
12                l.add(i);
13            }
14        }
15        return l;
16    }
17}