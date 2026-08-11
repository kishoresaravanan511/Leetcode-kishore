// Last updated: 8/11/2026, 2:22:37 PM
class Solution {
    public int maxProfit(int[] prices) {
        // List<Integer> l = new ArrayList<>();
        // int profit = 0;

        // for(int i=0;i<prices.length;i++)
        // {
        //     for(int j=i+1;j<prices.length;j++)
        //     {
        //         if(prices[i] >= prices[j])
        //         {
        //             continue;
        //         }
        //         else
        //         {
        //             profit = Math.max(profit,prices[j]-prices[i]);
        //             l.add(profit);
        //         }
        //     }
        // }
        // if(l.size() !=0)
        //     return Collections.max(l);

        // return 0;

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int x:prices)
        {
            if(x<minPrice)
            {
                minPrice = x;
            }
            else if(x - minPrice > maxProfit)
            {
                maxProfit = x-minPrice;
            }
        }
        return maxProfit;
    }
} 