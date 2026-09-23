// Last updated: 9/23/2026, 7:49:20 PM
1class Solution {
2    public int missingNumber(int[] nums) {
3        // int n = nums.length;
4        // int sum = (n*(n+1))/2;
5        // int numsSum = 0;
6        // for(int i=0;i<n;i++)
7        // {
8        //     numsSum += nums[i];
9        // }
10        // return sum-numsSum;
11
12        Map<Integer,Integer> m = new HashMap<>();
13        for(int i : nums)
14        {
15            m.put(i,m.getOrDefault(i,0)+1);
16        }
17        int missing = -1;
18        for(int i=0;i<=nums.length;i++)
19        {
20            int freq = m.getOrDefault(i,-1);
21            if(freq == -1)
22            {
23                missing = i;
24            }
25        }
26        return missing;
27    }
28}