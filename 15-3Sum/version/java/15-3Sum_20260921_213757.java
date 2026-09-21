// Last updated: 9/21/2026, 9:37:57 PM
1class Solution {
2    public int strStr(String haystack, String needle) {
3        if(haystack.contains(needle))
4            return haystack.indexOf(needle);
5        else
6            return -1;
7    }
8}