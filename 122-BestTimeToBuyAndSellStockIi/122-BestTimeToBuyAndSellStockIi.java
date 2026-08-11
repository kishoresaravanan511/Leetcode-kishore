// Last updated: 8/11/2026, 2:22:36 PM
class Solution {
    public int maxProfit(int[] prices) {
        int count=0;
        for(int i=0;i<prices.length-1;i++)
        {
            int p1 = prices[i];
            int p2 = prices[i+1];
            int res = p2-p1;

            if(res>=1) { 
                count+=res;
            }
        }
        return count;
        
    }
}