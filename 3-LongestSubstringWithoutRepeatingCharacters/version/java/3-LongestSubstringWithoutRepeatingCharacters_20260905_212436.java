// Last updated: 9/5/2026, 9:24:36 PM
class Solution {
    public int reverse(int x) {
        long ans = 0;

        while (x != 0) {
            int digit = x % 10;
            ans = ans * 10 + digit;
            x /= 10;
        }

        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE)
            return 0;

        return (int) ans;
    }
}