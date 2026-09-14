// Last updated: 9/14/2026, 8:07:43 PM
1class Solution {
2    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
3       if(rec1[0] < rec2[2] && rec2[0] < rec1[2] && rec1[1] < rec2[3] && rec2[1] < rec1[3])
4       {
5            return true;
6       } 
7       return false;
8    }
9}