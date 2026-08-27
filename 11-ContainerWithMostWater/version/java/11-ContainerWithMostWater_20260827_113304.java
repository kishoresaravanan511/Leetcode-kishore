// Last updated: 8/27/2026, 11:33:04 AM
class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length-1;
        int maxArea = 0;
        while(i <= j) {
            int minH = Math.min(height[i], height[j]);
            int curArea = minH * (j-i);
            maxArea = Math.max(maxArea, curArea);
            while(i <= j && height[i] <= minH) i++;
            while(i <= j && height[j] <= minH) j--; 
            // if(height[i] < height[j]) {
            //     i++;
            // }
            // else {
            //     j--;
            // }
        }
        return maxArea;

    }
}