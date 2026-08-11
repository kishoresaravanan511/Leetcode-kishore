// Last updated: 8/11/2026, 2:17:03 PM
class Solution {
    public int[][] transpose(int[][] matrix) {
        
        int[][] result = new int[matrix[0].length][matrix.length];

        for(int i=0;i<matrix[0].length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                result[i][j] = matrix[j][i];
            }
        }
        return result;
        
    }

}