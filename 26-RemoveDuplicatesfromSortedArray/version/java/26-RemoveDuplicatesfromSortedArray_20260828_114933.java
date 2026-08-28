// Last updated: 8/28/2026, 11:49:33 AM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int i=0;
4        for(int j=1;j<nums.length;j++)
5        { 
6            if(nums[i]!=nums[j])
7            {
8                i++;
9                nums[i] = nums[j];
10            }
11        }
12        return i+1;
13
14    }
15}