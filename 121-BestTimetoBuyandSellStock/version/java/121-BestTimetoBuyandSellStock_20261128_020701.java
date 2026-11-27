// Last updated: 11/28/2026, 2:07:01 AM
1class Solution {
2    public int maxProfit(int[] prices) {
3        // List<Integer> l = new ArrayList<>();
4        // int profit = 0;
5
6        // for(int i=0;i<prices.length;i++)
7        // {
8        //     for(int j=i+1;j<prices.length;j++)
9        //     {
10        //         if(prices[i] >= prices[j])
11        //         {
12        //             continue;
13        //         }
14        //         else
15        //         {
16        //             profit = Math.max(profit,prices[j]-prices[i]);
17        //             l.add(profit);
18        //         }
19        //     }
20        // }
21        // if(l.size() !=0)
22        //     return Collections.max(l);
23
24        // return 0;
25
26        int minPrice = Integer.MAX_VALUE;
27        int maxProfit = 0;
28
29        //iterating
30        for(int x:prices)
31        {
32            //if the incoming element is less than maxIntegerValue  , then min vlaue is changed.
33            if(x<minPrice)
34            {
35                minPrice = x;
36            }
37            //if imcoming element - minPrice is greater na , that is maxProfit.
38            else if(x - minPrice > maxProfit)
39            {
40                maxProfit = x-minPrice;
41            }
42        }
43        return maxProfit;
44    }
45} 