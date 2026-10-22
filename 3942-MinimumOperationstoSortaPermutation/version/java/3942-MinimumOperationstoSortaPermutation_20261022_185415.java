// Last updated: 10/22/2026, 6:54:15 PM
1class Solution {
2    public int minOperations(int[] nums) {
3        int n = nums.length;
4        int asc = 1;
5        int desc = 1;
6
7        for(int i=1;i<n;i++)
8        {
9            if(nums[i] == (nums[i-1]+1)%n)  //circular
10            {
11                asc++;
12            }
13            if(nums[i-1] == (nums[i]+1)%n)
14            {
15                desc++;
16            }
17        }    
18        if(asc == n)
19        {
20            return nums[0] == 0 ? 0 : Math.min(n-nums[0],nums[0]+2);
21        }
22        if(desc == n)
23        {
24            return Math.min(n-nums[n-1],nums[n-1])+1;
25        }
26        return -1;
27    }
28}