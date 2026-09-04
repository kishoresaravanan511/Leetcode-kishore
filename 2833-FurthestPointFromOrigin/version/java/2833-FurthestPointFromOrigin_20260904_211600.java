// Last updated: 9/4/2026, 9:16:00 PM
1class Solution {
2    public boolean rotateString(String s, String goal) {
3        if(s.length() != goal.length()) return false;
4
5        return (s+s).contains(goal);
6    }
7}