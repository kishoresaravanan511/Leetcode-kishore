// Last updated: 8/11/2026, 2:20:39 PM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int n = nums.length;
        // int[] ans = new int[n];
        // ans[0] = 1;
        // //prefix
        // for(int i=1;i<n;i++)
        // {
        //     ans[i] = ans[i-1]*nums[i-1];
        // }
        // //suffix
        // int rightSide = 1;
        // for(int i=n-1;i>=0;i--)
        // {
        //     ans[i] = ans[i]*rightSide;
        //     rightSide = rightSide*nums[i]; 
        // }
        // return ans;

        int n = nums.length;
        int[] ans = new int[n];
        ans[0] = 1;
        for(int i=1;i<n;i++)
        {
            ans[i] = ans[i-1]*nums[i-1];
        }
        int suffix = 1;
        for(int i = n-1;i>=0;i--)
        {
            ans[i] = suffix*ans[i];
            suffix = nums[i]*suffix;
        }
        return ans;
    }
}