// Last updated: 11/13/2026, 9:22:11 AM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int res = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i)) != -1) {
                res++;
            }
        }
        return res;
    }
}