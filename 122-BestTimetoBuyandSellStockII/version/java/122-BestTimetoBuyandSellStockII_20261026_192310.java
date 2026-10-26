// Last updated: 10/26/2026, 7:23:10 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int count=0;
4        for(int i=0;i<prices.length-1;i++)
5        {
6            //analysing the pattern deeply.. the logic is we cannot buy with high cost and sell in low cost, it is loss.
7            int p1 = prices[i];   //first
8            int p2 = prices[i+1]; //second
9            int res = p2-p1;      //difference because, buy - sell = profit
10
11            if(res>=1) { //res profit >= 1 means count it
12                count+=res;
13            }
14        }
15        return count;
16        
17    }
18}