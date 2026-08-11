// Last updated: 8/11/2026, 2:16:43 PM
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0;

        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        int currMax = 0;
        int currMin = 0;

        for(int x:nums)
        {
            currMax = Math.max(x,currMax+x);
            maxSum = Math.max(maxSum,currMax);
            
            currMin = Math.min(x,currMin+x);
            minSum = Math.min(minSum,currMin);

            total+=x;
        }

        if(maxSum < 0)
            return maxSum;

        return Math.max(total-minSum,maxSum);
    }
}