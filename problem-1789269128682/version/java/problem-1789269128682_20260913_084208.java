// Last updated: 9/13/2026, 8:42:08 AM
1class Solution {
2    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
3        int[][] temp = new int[n][n];
4        int[][] result = new int[n][n];
5        for(int i=0;i<n;i++)
6        {
7            for(int j=0;j<n;j++)
8            {
9                int newCol = (j-rowShift[i]+n)%n;
10                temp[i][newCol] = grid[i][j];
11            }
12        }
13        for(int j=0;j<n;j++)
14        {
15            for(int i=0;i<n;i++)
16            {
17                int newRow = (i-colShift[j]+n)%n;
18                result[newRow][j] = temp[i][j];
19            }
20        }
21        return result;
22    }
23}