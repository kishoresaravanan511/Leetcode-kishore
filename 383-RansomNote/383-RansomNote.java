// Last updated: 8/11/2026, 2:19:24 PM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // int[] counter = new int[128];

        // for (final char ch : magazine.toCharArray())
        //     ++counter[ch]; 

        // for (final char ch : ransomNote.toCharArray())
        //     if (--counter[ch] < 0)  
        //         return false;

        // return true;

        int[] freq = new int[128];

        for(char c : magazine.toCharArray())
        {
            ++freq[c-'a'];
        }
        for(char ch : ransomNote.toCharArray())
        {
            if( --freq[ch-'a'] < 0)
            {
                return false;
            }
        }
        return true;
    }
}