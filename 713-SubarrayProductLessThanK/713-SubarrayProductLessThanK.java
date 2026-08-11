// Last updated: 8/11/2026, 2:17:53 PM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1)    return 0;
        //if(nums.length==1)  return 1;
        int n = nums.length;
        int prod = 1;
        int c=0;
        int i=0;
        int j=0;

        while(j<n)
        {
            prod*=nums[j];

            while(prod>=k)
            {
                prod/=nums[i];
                i++;
            }
            c+=(j-i+1);
            j++;
        }
        return c;
    }
}