// Last updated: 8/11/2026, 2:21:23 PM
class Solution {
    void dfs(char[][] grid, int i,int j,int row,int col)
    {
        //edge case  and maintain this order because array index out of bounds exception occurs.
        if(i>=row || j>=col || i<0 || j<0 || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';

        //mark four directions as zero 
        dfs(grid,i-1,j,row,col);  //up
        dfs(grid,i+1,j,row,col);  //down
        dfs(grid,i,j-1,row,col);  //left
        dfs(grid,i,j+1,row,col);  //right
    }
    public int numIslands(char[][] grid) {
       int c = 0;

       int row = grid.length;
       int col = grid[0].length;

       for(int i=0;i<row;i++)
       {
        for(int j=0;j<col;j++)
        {
            if(grid[i][j] == '1')
            {
                c++;
                dfs(grid,i,j,row,col);  //for make all dir as zero
            }
        }
       }
       return c; 
    }
}