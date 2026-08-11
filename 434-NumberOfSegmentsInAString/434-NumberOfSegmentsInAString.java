// Last updated: 8/11/2026, 2:18:54 PM
class Solution {
    public int countSegments(String s) {
        String trimmed = s.trim();  //remove trailing spaces
        if(trimmed.isEmpty())   return 0;   //after trim it is empty na , 0.

        return trimmed.split("\\s+").length;   //string array's length
    }
}