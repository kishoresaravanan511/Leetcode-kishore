// Last updated: 9/2/2026, 5:41:19 AM
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
17            int hours = 0;
18
19            for(int x : piles)
20            {
21                //important case....
22                hours += (x + mid - 1)/mid;   //for every pile we calculate the hours 
23            }
24            if(hours <= h)
25            {
26                high = mid;
27            }
28            else
29            {
30                low = mid+1;
31            }
32        }
33        return low;
34    }
35}