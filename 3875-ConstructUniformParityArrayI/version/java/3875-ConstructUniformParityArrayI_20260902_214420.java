// Last updated: 9/2/2026, 9:44:20 PM
1class Solution {
2    public boolean uniformArray(int[] nums1) {
3        int n = nums1.length;
4        List<Integer> l = new ArrayList<>();
5
6        for(int i=0;i<n;i++)
7        {
8            for(int j=0;j<n;j++)
9            {
10                if(j!=i)
11                {
12                    l.add(Math.abs(nums1[i]-nums1[j]));
13                }
14            }
15        }
16        if(l.contains(0))   return false;
17        return true;
18    }
19}