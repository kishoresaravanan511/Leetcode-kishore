// Last updated: 8/11/2026, 2:20:34 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean flag = false;

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j] == target)  
                    return true;
            }
        }
        return false;
    }
}