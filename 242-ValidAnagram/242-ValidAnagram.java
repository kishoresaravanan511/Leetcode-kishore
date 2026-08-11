// Last updated: 8/11/2026, 2:20:31 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freqS = new int[26];
        
        for(char c : s.toCharArray())
        {
            freqS[c - 'a']++;
        }
        for(char ch : t.toCharArray())
        {
            freqS[ch - 'a']--;
        }

        for(int x : freqS)
        {
            if(x!=0)    return false;
        }
        return true;
    }
}