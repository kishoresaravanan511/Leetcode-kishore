// Last updated: 11/10/2026, 10:37:53 PM
1class Solution {
2    public int[] findErrorNums(int[] nums) {
3        int duplicate = -1;
4        int missing = -1;
5        for(int i=1;i<=nums.length;i++)
6        {
7            int count = 0;
8            for(int j=0;j<nums.length;j++)
9            {
10                if(nums[j] == i)
11                {
12                    count++;
13                }
14            }
15            if(count == 2)
16            {
17                duplicate = i;
18            }
19            else if(count == 0)
20            {
21                missing = i;
22            }
23        }
24        return new int[]{duplicate,missing};
25    }
26}