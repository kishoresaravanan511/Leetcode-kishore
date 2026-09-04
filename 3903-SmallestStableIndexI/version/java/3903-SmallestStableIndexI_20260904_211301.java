// Last updated: 9/4/2026, 9:13:01 PM
1class Solution {
2    public int minElement(int[] nums) {
3        int n = nums.length;
4        int ans = 0;
5        int min = Integer.MAX_VALUE;
6        int[] res = new int[n];
7        for(int i=0;i<n;i++)
8        {
9            res[i] = helper(nums[i]);
10        }
11        for(int x : res)
12        {
13            if(x < min)
14            {
15                min = x;
16            }
17        }
18        return min;
19    }
20    int helper(int n)
21    {
22        int ans = 0;
23        while(n!=0)
24        {
25            int r=n%10;
26            ans += r;
27            n/=10;
28        }
29        return ans;
30    }
31}