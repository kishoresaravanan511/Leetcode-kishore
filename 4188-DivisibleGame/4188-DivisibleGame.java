// Last updated: 8/11/2026, 2:14:01 PM
class Solution {
    public int divisibleGame(int[] nums) {
        int n = nums.length;
        TreeSet<Integer> validKValues = new TreeSet<>();
        validKValues.add(2);
        //int maxVal = 0;
        for(int num:nums)
            {
        if(num<2)continue;
                for(int d=1;d*d<=num;d++)
                    {
                        if(num%d == 0)
                        {
                            if(d>1) validKValues.add(d);
                            if(num/d>1) validKValues.add(num/d);
                        }
                    }
            }

        //int kLimit = Math.max(2,maxVal);
        long maxGlobalDiff = Long.MIN_VALUE;
        int bestK = 2;
        long MOD = 1_000_000_007L;

        for(int k:validKValues)
            {
                long maxSubarrayDiff = Long.MIN_VALUE;
                long currentDiff = 0;
                boolean started = false;
                for(int i=0;i<n;i++)
                    {
                        long contribution = (nums[i]%k ==0) ? nums[i]:-nums[i];

                        if(!started)
                        {
                            currentDiff = contribution;
                            started = true;}
                        else
                        {
                            currentDiff = Math.max(contribution,currentDiff+contribution);
                        }
                        maxSubarrayDiff = Math.max(maxSubarrayDiff,currentDiff);
                        }
                if(maxSubarrayDiff>maxGlobalDiff)
                {
                    maxGlobalDiff = maxSubarrayDiff;
                    bestK = k;
                }
                    }
        //long MOD = 1_000_000_007L;
        long ans = (maxGlobalDiff% MOD) * (bestK%MOD);
        ans = ans%MOD;
        if(ans<0)
        {
            ans+=MOD;
        }
        return (int)ans;
    }
}