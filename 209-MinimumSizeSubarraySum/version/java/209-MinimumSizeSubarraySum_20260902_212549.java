// Last updated: 9/2/2026, 9:25:49 PM
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int n = nums.length;
4        int i=0;
5        int sum=0;
6        int ans = Integer.MAX_VALUE;
7
8        for(int j=0;j<n;j++)
9        {
10            sum+=nums[j];
11            while(sum>=target)  //given condition 
12            {
13                ans = Math.min(ans,j-i+1);  //for generate length
14                sum-=nums[i]; //shrinking
15                i++;   //expanding
16            }
17
18        }
19        if(ans == Integer.MAX_VALUE)    return 0;
20        return ans;
21    }
22}