// Last updated: 8/11/2026, 2:13:47 PM
class Solution {
    public long maxPairStrength(int[] nums) {
        int n = nums.length;
        long ans = 0;
        for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<n;j++)
                    {
                        long g = GCDof(nums[i],nums[j]);
                        long stren = (1L*nums[i]*nums[j])/(g*g);
                        ans = Math.max(ans,stren);
                    }
            }
        return ans;
    }

    int GCDof(int a,int b)
    {
        while(b!=0)
            {
                int temp = a%b;
                a=b;
                b=temp;
            }
        return a;
    }
}