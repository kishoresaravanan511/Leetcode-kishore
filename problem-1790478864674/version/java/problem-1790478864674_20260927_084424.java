// Last updated: 9/27/2026, 8:44:24 AM
1class Solution {
2    public int[] rearrangeArray(int[] nums) {
3        int n = nums.length;
4        int[] freq = new int[101];
5        int[] ans = new int[nums.length];
6
7        for(int i : nums)
8            {
9                freq[i]++;
10            }
11        int ind = 0;
12        while(ind < nums.length)
13        {
14        for(int i=0;i<=100;i++)
15            {
16                if(freq[i] > 0)
17                {
18                    ans[ind++] = i;
19                    freq[i]--;
20                }
21            }
22        }
23        return ans;
24        
25    }
26}