// Last updated: 8/11/2026, 2:14:50 PM
class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character,Character> m = new HashMap<>();
        char ch = 'a';

        for(char c : key.toCharArray())
        {
            if(c!=' ' && !m.containsKey(c))
            {
                m.put(c,ch);
                ch++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char x : message.toCharArray())
        {
            if(x==' ')
            {
                sb.append(' ');
            }
            else
            {
                sb.append(m.get(x));
            }
        }
        return sb.toString();
    }
}