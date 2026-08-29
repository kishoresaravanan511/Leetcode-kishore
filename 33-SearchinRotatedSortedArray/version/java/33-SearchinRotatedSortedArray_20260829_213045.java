// Last updated: 8/29/2026, 9:30:45 PM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int rows = matrix.length;
4        int cols = matrix[0].length;
5        int left = 0;
6        int right = rows * cols - 1;  
7
8        while (left <= right) {
9            int mid = (left + right) / 2;  
10            int row = mid / cols;  
11            int col = mid % cols;
12            int guess = matrix[row][col];  
13
14            if (guess == target) {
15                return true;
16            } else if (guess < target) {
17                left = mid + 1;
18            } else {
19                right = mid - 1;
20            }
21        }
22
23        return false;        
24    }
25}