// Last updated: 10/23/2026, 10:35:45 AM
1class Solution {
2    public int minimumSwaps(int[] nums) {
3        int n = nums.length;
4        int i = 0;
5        int j = n-1;
6        int swaps = 0;
7
8        while(i<=j)
9        {
10            if(nums[j] == 0)
11            {
12                j--;
13                continue;
14            }
15            if(nums[i] == 0)
16            {
17                nums[i] = nums[j];
18                nums[j] = 0;
19                j--;
20                swaps++;
21            }
22            i++;
23        }
24        return swaps;
25    }
26}