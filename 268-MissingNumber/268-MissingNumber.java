// Last updated: 8/11/2026, 2:20:15 PM
class Solution {
    public int missingNumber(int[] nums) {
        int i,j,sum=0;
        int n=nums.length;
        for(i=0;i<n;i++)
        {
            sum+=nums[i];
        }
        int res = n*(n+1)/2;

        return res-sum;
    }
}