// Last updated: 9/10/2026, 3:03:42 PM
1class Solution {
2    public int trap(int[] height) {
3        int[] left = new int[height.length];
4        int[] right = new int[height.length];
5        int max = -1;
6
7        for(int i=0;i<height.length;i++)
8        {
9            if(height[i] >= max)
10            {
11                max = height[i];
12            }
13            left[i] = max;
14        }
15
16        max = -1;
17
18        for(int i=height.length-1;i>=0;i--)
19        {
20            if(height[i] >= max)
21            {
22                max = height[i];
23            }
24            right[i] = max;
25        }
26        int total = 0;
27        
28        for(int i=0;i<height.length;i++)
29        {
30            total += Math.min(left[i],right[i]) - height[i];
31        }
32        return total;
33    }
34}