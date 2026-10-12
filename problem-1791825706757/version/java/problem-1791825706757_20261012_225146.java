// Last updated: 10/12/2026, 10:51:46 PM
class Solution {
    public int minimumCost(int[] cst) {
        Arrays.sort(cst);

        int ans = 0;
        int idx = 0;

        for (int i = cst.length - 1; i >= 0; i--) {
            if (idx % 3 != 2) {
                ans += cst[i];
            }
            idx++;
        }

        return ans;
    }
}