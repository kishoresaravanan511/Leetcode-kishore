// Last updated: 8/11/2026, 2:22:05 PM
class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");  //regular expression
        StringBuilder str = new StringBuilder();

        for(int i = words.length-1;i>=0;i--)
        {
            str.append(words[i]);
            if(i != 0)  str.append(" ");
        }
        return str.toString();

    }
}