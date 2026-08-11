// Last updated: 8/11/2026, 2:23:03 PM
class Solution {
    public void sortColors(int[] nums) {
        int i,c=0,c1=0;

        for(i=0;i<nums.length;i++)
        {
                if(nums[i]==0)
                    c++;
                else if(nums[i]==1)
                    c1++;
        }
        for(i=0;i<c;i++)
            nums[i]=0;
        for(i=c;i<c+c1;i++)
            nums[i]=1;
        for(i=c+c1;i<nums.length;i++)
            nums[i]=2;
    }
}