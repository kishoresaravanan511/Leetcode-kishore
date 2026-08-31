// Last updated: 8/31/2026, 8:27:32 PM
1class Solution {
2    public int findDuplicate(int[] nums) {
3        // int n = nums.length;
4        // int[] freq = new int[n];
5        // boolean flag = false;
6        // int ans = 0;
7        // for(int i=0;i<n;i++)
8        // {
9        //     freq[nums[i]]++;
10        //     if(freq[nums[i]] > 1)
11        //     {
12        //         flag = true;
13        //         ans = nums[i];
14        //         break;
15        //     }
16        // }
17        // return ans;
18
19        int n = nums.length;
20        boolean[] visited = new boolean[n+1];
21        for(int x : nums)
22        {
23            if(visited[x])
24            {
25                return x;
26            }
27            else
28            {
29                visited[x] = true;
30            }
31        }
32        return -1;
33    }
34}