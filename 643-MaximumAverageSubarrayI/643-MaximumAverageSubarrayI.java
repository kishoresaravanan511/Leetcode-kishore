// Last updated: 8/11/2026, 2:18:08 PM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        // int n = nums.length;
        // int maxAvg = 0;
        // int avg = 0;

        // //manual window compute
        // for(int i=0;i<k;i++)
        // {
        //     maxAvg+=nums[i];
        // }
        // avg = maxAvg;
        
        // //dynamic window
        // int st = 0;
        // int end = k;
        
        // while(end<n)
        // {
        //     avg-=nums[st];   
        //     st++;

        //     avg+=nums[end];
        //     end++;
            

        //     maxAvg = Math.max(avg,maxAvg);
        // }

        // return (double)maxAvg/k;

        // int n = nums.length;
        // int sum=0;
        // int max = Integer.MIN_VALUE;
        // int avgMax = 0;
        // int st = 0;
        // int end = k;
        // //manual
        // for(int i=0;i<k;i++)
        // {
        //     sum+=nums[i];
        // }
        // avgMax = sum;
        // while(end<n)
        // {
        //     sum-=nums[st];
        //     st++;
        //     sum+=nums[end];
        //     end++;
        //     avgMax = Math.max(sum,avgMax);
        // }
        // return (double)avgMax/k;

        int n = nums.length;
        int sum=0;
        int maxAvg = Integer.MIN_VALUE;

        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        maxAvg = sum;

        for(int i=k;i<n;i++)
        {
            sum-=nums[i-k];
            sum+=nums[i];

            maxAvg = Math.max(sum,maxAvg);
        }
        return (double)maxAvg/k;
    }

}