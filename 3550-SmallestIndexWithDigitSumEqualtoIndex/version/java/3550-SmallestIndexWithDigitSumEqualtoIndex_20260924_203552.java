// Last updated: 9/24/2026, 8:35:52 PM
1class Solution {
2    public int smallestIndex(int[] nums) {
3        for(int i=0;i<nums.length;i++)
4        {
5            int x = nums[i];
6            int sum=0;
7            while(x!=0)
8            {
9                int r = x%10;
10                sum+=r;
11                x/=10;
12            }
13            if(sum == i)
14            {
15                return sum;            
16            }
17        }
18        return -1;   
19    }
20}