// Last updated: 10/30/2026, 11:20:27 PM
1public class Solution {
2    public String removeDuplicateLetters(String s) {
3        int[] cnt = new int[26];
4        int pos = 0;
5        for (int i = 0; i < s.length(); i++) cnt[s.charAt(i) - 'a']++;
6        for (int i = 0; i < s.length(); i++) {
7            if (s.charAt(i) < s.charAt(pos)) pos = i;
8            if (--cnt[s.charAt(i) - 'a'] == 0) break;
9        }
10        return s.length() == 0 ? "" : s.charAt(pos) + removeDuplicateLetters(s.substring(pos + 1).replaceAll("" + s.charAt(pos), ""));
11    }
12}