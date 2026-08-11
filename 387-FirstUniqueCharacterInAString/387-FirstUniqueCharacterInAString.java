// Last updated: 8/11/2026, 2:19:22 PM
class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[256];
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            freq[ch]++;
        }
    
    for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(freq[ch]==1)
                return i;
        }
        return -1;
    }
}