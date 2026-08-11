// Last updated: 8/11/2026, 2:16:24 PM
class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeroCount = 0;
        int i=0;
        int maxLen = 0;
        int ans=0;

        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]==0)
            {
                zeroCount++;
            }
            while(zeroCount>k)
            {
                if(nums[i] == 0)
                {
                    zeroCount--;
                }
                i++;
            }
            int windowLength=j-i+1;
            maxLen = Math.max(windowLength,maxLen);
        }
        return maxLen;
    }
}