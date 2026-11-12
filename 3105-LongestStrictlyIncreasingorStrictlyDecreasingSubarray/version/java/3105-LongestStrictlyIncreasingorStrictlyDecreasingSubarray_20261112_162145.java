// Last updated: 11/12/2026, 4:21:45 PM
1class Solution {
2    public int longestMonotonicSubarray(int[] nums) {
3        int n = nums.length;
4        int incCount = 1;
5        int decCount = 1;
6        int max = 1;
7    
8        for(int i=1;i<n;i++)
9        {
10            if(nums[i-1] < nums[i])
11            {
12                incCount++;
13                decCount=1;
14            }
15            else if(nums[i-1] > nums[i])
16            {
17                decCount++;
18                incCount=1;
19            }
20            else
21            {
22                decCount=1;
23                incCount=1;
24            }
25            max = Math.max(max,Math.max(decCount,incCount));
26        }
27        return max;
28    }
29}