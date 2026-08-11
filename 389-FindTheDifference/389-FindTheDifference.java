// Last updated: 8/11/2026, 2:19:17 PM
class Solution {
    public char findTheDifference(String s, String t) {
        int[] freq = new int[26];

        for(int x:s.toCharArray())
        {
            freq[x - 'a']++;
        }
        for(int i=0;i<t.length();i++)
        {
            char ch = t.charAt(i);
            freq[ch-'a']--;
        
        if(freq[ch - 'a'] < 0)
            return ch;
        }

        return ' ';
    }
}