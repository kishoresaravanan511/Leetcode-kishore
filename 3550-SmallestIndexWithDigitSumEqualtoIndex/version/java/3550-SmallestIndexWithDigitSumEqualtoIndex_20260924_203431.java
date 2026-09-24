// Last updated: 9/24/2026, 8:34:31 PM
1class Solution {
2    public int smallestIndex(int[] nums) {
3        int n = nums.length;
4        int sum = 0;
5        for(int i=0;i<n;i++)
6        {
7            int x = nums[i];
8            sum=0;
9            while(x!=0)
10            {
11                int r = x%10;
12                sum+=r;
13                x/=10;
14            System.out.println(sum);
15            }
16            if(sum == i)
17            {
18                return sum;            
19            }
20        }
21        return -1;   
22    }
23}