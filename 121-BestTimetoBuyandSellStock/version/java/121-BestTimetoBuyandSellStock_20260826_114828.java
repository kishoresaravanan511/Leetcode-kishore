// Last updated: 8/26/2026, 11:48:28 AM
1class Solution {
2    public int maxProduct(int[] nums) {
3        int min = nums[0];
4        int max = nums[0];
5        int ans = nums[0];
6
7        for(int i=1;i<nums.length;i++)
8        {
9            //why we need to swap min with max and vice versa, if max = 3,min = 2,nums[i]=-1,so now max = 2,min = 3 and product -1 with max and min , we get max = -2 and min = -3,so the max is -2 ofcourse.
10            if(nums[i]<0)
11            {
12                int temp = max;
13                max = min;
14                min = temp;
15            }
16            
17            max = Math.max(nums[i],max*nums[i]);
18            min = Math.min(nums[i],min*nums[i]);
19
20            ans = Math.max(ans,max);
21        }
22        return ans;
23    }
24}