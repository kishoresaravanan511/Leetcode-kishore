// Last updated: 8/27/2026, 11:29:49 AM
1class Solution {
2    public int maxArea(int[] height) {
3        int left = 0;
4        int right = height.length-1;
5        int maxx = Integer.MIN_VALUE;
6
7        while(left<right)
8        {
9        int width = right - left;   //8   //7
10
11        int hght = Math.min(height[left],height[right]);   //1   //7
12        
13        maxx=Math.max(maxx,width*hght);   //8   //49
14
15            if(height[left]<height[right])   //1
16                left++;
17            else
18                right--;
19        }
20        return maxx;
21
22    }
23}