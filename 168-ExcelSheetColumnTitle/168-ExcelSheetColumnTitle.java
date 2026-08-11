// Last updated: 8/11/2026, 2:21:54 PM
class Solution {
    public String convertToTitle(int columnNumber) {
        int  n=columnNumber ;
        return n == 0 ? "" : convertToTitle(--n/26) + (char)('A' + (n%26));
    }
}