// Last updated: 8/11/2026, 2:13:44 PM
class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);

        int n = prices.length;
        int m = discounts.length;
        double tot=0;
        int i=n-1;
        int j=m-1;

        while(i>=0  &&  j>=0)
            {
                tot+=prices[i]*(100.0-discounts[j])/100.0;
                i--;
                j--;
            }
        while(i>=0)
            {
                tot+=prices[i];
                i--;
            }
        return tot;
    }
}