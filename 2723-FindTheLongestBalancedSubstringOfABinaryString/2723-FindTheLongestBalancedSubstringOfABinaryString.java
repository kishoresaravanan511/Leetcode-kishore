// Last updated: 8/11/2026, 2:14:36 PM
class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int maxLen=0;
        int zeroes = 0;
        int ones = 0;

        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c=='0')
            {
                if(ones > 0){
                    zeroes = 0;
                    ones = 0;
                }
                zeroes++;
            }
            else
            {
                ones++;
                maxLen = Math.max(maxLen,Math.min(zeroes,ones)*2);
            }
        }
        return maxLen;
    }
}