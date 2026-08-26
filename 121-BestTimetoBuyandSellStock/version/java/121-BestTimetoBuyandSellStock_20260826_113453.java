// Last updated: 8/26/2026, 11:34:53 AM
1class Solution {
2    public String reverseWords(String s) {
3        String[] words = s.trim().split("\\s+");  //regular expression
4        StringBuilder str = new StringBuilder();
5
6        for(int i = words.length-1;i>=0;i--)
7        {
8            str.append(words[i]);
9            if(i != 0)  str.append(" ");
10        }
11        return str.toString();
12
13    }
14}