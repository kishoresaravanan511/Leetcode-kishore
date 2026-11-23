// Last updated: 11/24/2026, 12:08:04 AM
1class Solution {
2    String[][] board;
3    int c =0;
4    
5    boolean isValid(int row,int col,int n){
6        // upper 
7        for(int i = row-1;i>=0;i--)
8            if (board[i][col].equals("Q"))
9                return false;
10        
11        // left diagonal 
12        for(int i=row-1, j = col-1; i>=0 && j>=0 ; i--,j--)
13            if(board[i][j].equals("Q"))
14                return false;
15        
16        // right diagonal
17        for(int i=row-1, j = col+1; i>=0 && j<n ; i--,j++)
18            if(board[i][j].equals("Q"))
19                return false;
20                
21        return true;
22    }
23    void back(int row, int n){
24        if(row==n){
25            c++;
26            return;
27        }
28        for(int col = 0;col < n;col++){
29            if(isValid(row,col,n)){ 
30                board[row][col] = "Q";
31                back(row+1,n);
32                board[row][col] = ".";
33            }
34        }
35    }
36    public int totalNQueens(int n) {
37        board = new String[n][n];
38        for(String[] row : board)
39            Arrays.fill(row,".");
40            
41        back(0,n);
42        return c;
43    }
44}