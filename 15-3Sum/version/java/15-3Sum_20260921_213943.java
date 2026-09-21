// Last updated: 9/21/2026, 9:39:43 PM
1class Solution {
2    public void sortColors(int[] nums) {
3        int i,c=0,c1=0;
4
5        for(i=0;i<nums.length;i++)
6        {
7            if(nums[i]==0)
8                c++;
9            else if(nums[i]==1)
10                c1++;
11        }
12        for(i=0;i<c;i++)
13            nums[i]=0;
14        for(i=c;i<c+c1;i++)
15            nums[i]=1;
16        for(i=c+c1;i<nums.length;i++)
17            nums[i]=2;
18    }
19}