// Last updated: 8/11/2026, 2:16:35 PM
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        Arrays.sort(nums);
        int n = nums.length;

        int i=0;
        int j=1;
        while(i<n && j<n)
        {
            if(nums[i]%2==0)
            {
                i+=2;
            }
            else if(nums[j]%2!=0)
            {
                j+=2;
            }
            else
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i+=2;
                j+=2;
            }
        }
        return nums;
    }
}