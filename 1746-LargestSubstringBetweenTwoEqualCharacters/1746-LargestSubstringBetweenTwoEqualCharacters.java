// Last updated: 8/11/2026, 2:15:37 PM
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character,Integer> m = new HashMap<>();
        int max = -1;

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);

            if(!m.containsKey(ch))
            {
                m.put(ch,i);
            }
            else
            {
                max = Math.max(max,i-m.get(ch) - 1);
            }
        }
        return max;
    }
}