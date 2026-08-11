// Last updated: 8/11/2026, 2:19:10 PM
class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> m = new HashMap<>();

        for(char c : s.toCharArray())
        {
            m.put(c,m.getOrDefault(c,0)+1);
        }
        int res = 0;
        boolean hasOddFreq = false;
        for(int x : m.values())
        {
            if(x%2==0)
            {
                res+=x;
            }
            else
            {
                res+=x-1;
                hasOddFreq = true;
            }
        }
        if(hasOddFreq)  return res+1;
        return res;
    }
}