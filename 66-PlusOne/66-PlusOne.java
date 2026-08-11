// Last updated: 8/11/2026, 2:23:22 PM
class Solution {
    public int[] plusOne(int[] digits) {
        int i=0;
        for(i=digits.length-1;i>=0;i--)
        {
            if(digits[i]!=9)
            {
                digits[i]+=1;
                return digits;
            }
            else
                digits[i]=0;
        }
        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }
}