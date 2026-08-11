// Last updated: 8/11/2026, 2:15:54 PM
class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        //Arrays.sort(nums);

        for(int x : nums)
        {
            if(x>max1)
            {
                max2 = max1;
                max1 = x;
            }
            else if(x>max2)
            {
                max2 = x;
            }
        }
        return (max1-1) * (max2-1);
        //return (nums[n-2]-1)*(nums[n-1]-1);
    }
}