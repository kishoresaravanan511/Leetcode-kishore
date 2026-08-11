// Last updated: 8/11/2026, 2:18:13 PM
class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int i=0;    
        int max = 0;

        for(int j=0;j<nums.length;j++)
        {
            while(nums[j]-nums[i] > 1)
            {
                i++;
            }
            if(nums[j] - nums[i] == 1)
            {
                max = Math.max(max,j-i+1);
            }
        }
        return max;
    }
}