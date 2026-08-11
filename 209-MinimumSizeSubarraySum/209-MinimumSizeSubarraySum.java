// Last updated: 8/11/2026, 2:21:05 PM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int i=0;
        int j=0;
        int sum=0;
        int ans = Integer.MAX_VALUE;

        while(j<n)
        {
            sum+=nums[j];
            while(sum>=target)
            {
                ans = Math.min(ans,j-i+1);
                sum-=nums[i];
                i++;
            }
            j++;

        }
        if(ans == Integer.MAX_VALUE)    return 0;
        return ans;
    }
}