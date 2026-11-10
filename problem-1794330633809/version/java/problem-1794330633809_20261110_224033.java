// Last updated: 11/10/2026, 10:40:33 PM
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans =  new int[2];
        int[] freq = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]] += 1;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(freq[i]);
        }


        for (int i = 1; i < freq.length; i++) {
            if (freq[i] == 2) {
                ans[0] = i;
            }

            if (freq[i] == 0) {
                ans[1] = i;
            }
        }

        return ans;
    }
}