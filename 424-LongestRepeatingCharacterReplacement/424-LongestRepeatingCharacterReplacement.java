// Last updated: 8/11/2026, 2:18:57 PM
class Solution {
    public int characterReplacement(String s, int k) {
        int ans=0;
        int left =0;
        int maxFreq = 0;
        int[] freq = new int[26];
        
        for(int right=0;right<s.length();right++)
        {
            int index = s.charAt(right)-'A';
            freq[index]++;

            maxFreq = Math.max(freq[index],maxFreq);
            int windowLength = right-left+1;

            if(windowLength-maxFreq <= k)
            {
                ans = Math.max(windowLength,ans);
            }
            else
            {
                freq[s.charAt(left)-'A']--;
                left++;
                windowLength = right-left+1;
            }
            
        }
        return ans;
    }
}