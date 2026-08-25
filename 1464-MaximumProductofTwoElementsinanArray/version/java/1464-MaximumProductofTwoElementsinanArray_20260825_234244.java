// Last updated: 8/25/2026, 11:42:44 PM
1class Solution {
2    public int maxProduct(int[] nums) {
3        int n = nums.length;
4        int max1 = Integer.MIN_VALUE;
5        int max2 = Integer.MIN_VALUE;
6        //Arrays.sort(nums);
7
8        for(int x : nums)
9        {
10            if(x>max1)
11            {
12                max2 = max1;
13                max1 = x;
14            }
15            else if(x>max2)
16            {
17                max2 = x;
18            }
19        }
20        return (max1-1) * (max2-1);
21        //return (nums[n-2]-1)*(nums[n-1]-1);
22    }
23}