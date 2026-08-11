// Last updated: 8/11/2026, 2:13:42 PM
class Solution {
    public int minimumCost(int[] nums, int k) {
       long MOD = 1000000007L;
        long available = k;
        long opCount =0;
        long totalCost=0;

        for(int x:nums)
            {
                if(available<x)
                {
                    long needed = x-available;
                    long operationsNeeded = (needed +k-1)/k;

                    long startOp = opCount+1;
                    long endOp = opCount+operationsNeeded;

                    long sumOps = startOp+endOp;
                    long term1 = operationsNeeded%MOD;
                    long term2 = sumOps%MOD;

                    long product = (term1*term2)%MOD;

                    //     if(term1%2==0)
                    //     {
                    //         term1/=2;
                    //     }
                    // else
                    //     {
                    //         term2/=2;
                    //     }
                    // term1%=MOD;
                    // term2%=MOD;
                    long currentCostSum = (product*500000004L)%MOD;
                    totalCost = (totalCost+currentCostSum)%MOD;
                    opCount+=operationsNeeded;
                    available +=operationsNeeded*k;
                }
                available-=x;
            }
        return (int)(totalCost%MOD);
    }
}