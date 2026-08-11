// Last updated: 8/11/2026, 2:13:57 PM
class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int n = nums.length;
        int c=0;

        for(int i=0;i<n;i++)
            {
                int x=0;
                int y=0;
                for(int j=i;j<n;j++)
                    {
                        if(nums[j]%2==0)
                        {
                            x++;
                        }
                        else
                        {
                            y++;
                        }
                        if(y>0 && x*b <= y*a)
                        {
                            c++;
                        }
                    }
            }
        return c;
    }
}