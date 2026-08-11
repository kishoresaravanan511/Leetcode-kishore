// Last updated: 8/11/2026, 2:18:35 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int c = 0;
        for(int x:nums)
        {
            if(x==1)
            {
                c++;
            }
            else
            {
                max = Math.max(max,c);
                c=0;
            }
        }
        return max>c ? max : c;
    }
}