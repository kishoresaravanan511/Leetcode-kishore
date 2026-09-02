// Last updated: 9/2/2026, 5:39:58 AM
1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3        int n = piles.length;
4        int low = 1;
5        int high = Integer.MIN_VALUE;
6    
7        for(int a : piles)
8        {
9            if(a>high)
10            {
11                high = a;
12            }
13        }
14        while(low < high)
15        {
16            int mid = low+(high-low)/2;
17            long hours = 0;
18
19            for(int x : piles)
20            {
21                hours += (x + mid - 1)/mid;   //for every pile we calculate the hours 
22            }
23            if(hours <= h)
24            {
25                high = mid;
26            }
27            else
28            {
29                low = mid+1;
30            }
31        }
32        return low;
33    }
34}