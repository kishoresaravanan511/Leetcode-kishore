// Last updated: 8/11/2026, 2:15:05 PM
class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>max)
            {
                max = nums[i];
            }
            if(nums[i]<min)
            {
                min = nums[i];
            }
        }
        return GcdOfTwoNum(max,min);
    }
    public int GcdOfTwoNum(int a,int b)
    {
        while(b!=0)
        {
            int temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }
}