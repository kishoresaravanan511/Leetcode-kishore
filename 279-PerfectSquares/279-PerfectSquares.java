// Last updated: 8/11/2026, 2:20:11 PM
class Solution {

    int[] memo;

    public int numSquares(int n) {
        memo = new int[n+1];
        Arrays.fill(memo, -1);
        return solve(n);
    }

    public int solve(int n) {
        if(n == 0) return 0;
        if(n < 0) return Integer.MAX_VALUE;
        if(memo[n] != -1) return memo[n];
        int ans = Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++) {
            ans = Math.min(
                ans,
                1 + solve(n-(i*i))
            );
        }
        return memo[n] = ans;
    }
}