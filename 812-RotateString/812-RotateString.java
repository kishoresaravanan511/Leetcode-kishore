// Last updated: 8/11/2026, 2:17:22 PM
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;

        return (s+s).contains(goal);
    }
}