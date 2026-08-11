// Last updated: 8/11/2026, 2:18:09 PM
class Solution {
    public int maximumProduct(int[] nums) {
        // int n = nums.length;
        // Arrays.sort(nums);
        // int max = 0;
        // int min = 0;
        // int ans = 0;

        
        // max = nums[0]*nums[1]*nums[n-1];  //for negative numbers
        // min = nums[n-1]*nums[n-2]*nums[n-3];   //for last indexed numbers.

        // ans = Math.max(max,min);

        // return ans;

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;


        for(int x : nums)
        {
            if(x > max1)
            {
                max3 = max2;
                max2 = max1;
                max1 = x;
            }
            else if(x > max2)
            {
                max3=max2;
                max2=x;
            }
            else if(x > max3)
            {
                max3 = x;
            }

            if(x<min1)
            {
                min2 = min1;
                min1 = x;
            }
            else if(x<min2)
            {
                min2 = x;
            }
        }
        
        return Math.max(max1*max2*max3,min1*min2*max1);
    }
}