// Last updated: 8/11/2026, 2:14:32 PM
class Solution {
    public int buyChoco(int[] prices, int money) {
        //two pointer approach is not suitable for this problem becoz, minimal cost of buying two chocolates.

        Arrays.sort(prices);

        int cost = prices[0]+prices[1];

        return (cost<=money) ? money-cost : money;
    }
}