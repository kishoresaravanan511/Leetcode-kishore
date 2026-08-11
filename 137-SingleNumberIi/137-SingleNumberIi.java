// Last updated: 8/11/2026, 2:22:22 PM

class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            int countOnes = 0;
            for (int j = 0; j < nums.length; j++) {
                countOnes += (nums[j] >> i) & 1;
            }
            countOnes = countOnes % 3;
            if (countOnes != 0) {
                res |= countOnes << i;
            }
        }
        return res;
    }
}