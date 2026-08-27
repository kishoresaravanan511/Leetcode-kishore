// Last updated: 8/27/2026, 7:18:43 PM
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n = nums.length;
4        int[] ans = new int[n];
5        ans[0] = 1;
6        //prefix
7        for(int i=1;i<n;i++)
8        {
9            ans[i] = ans[i-1]*nums[i-1];
10        }
11        //suffix
12        int rightSide = 1;
13        for(int i=n-1;i>=0;i--)
14        {
15            ans[i] = ans[i]*rightSide;
16            rightSide = rightSide*nums[i]; 
17        }
18        return ans;
19
20        // int n = nums.length;
21        // int[] ans = new int[n];
22        // ans[0] = 1;
23        // for(int i=1;i<n;i++)
24        // {
25        //     ans[i] = ans[i-1]*nums[i-1];
26        // }
27        // int suffix = 1;
28        // for(int i = n-1;i>=0;i--)
29        // {
30        //     ans[i] = suffix*ans[i];
31        //     suffix = nums[i]*suffix;
32        // }
33        // return ans;
34    }
35}