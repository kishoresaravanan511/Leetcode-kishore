// Last updated: 8/11/2026, 2:23:00 PM
class Solution {
    boolean back(char[][] board, String word, int i, int j, int row, int col, int ind){
        
        if(ind==word.length()) 
            return true;
          
        if(i<0 || j<0 || i>=row || j>=col || board[i][j]!=word.charAt(ind)) 
            return false;
            
        board[i][j] = '*'; 
        
        if(back(board,word,i-1,j,row,col,ind+1) || back(board,word,i,j-1,row,col,ind+1) || 
        back(board,word,i+1,j,row,col,ind+1) || back(board,word,i,j+1,row,col,ind+1) )
            return true;
        board[i][j] = word.charAt(ind);
        return false;
    }
    public boolean exist(char[][] board, String word) {
        
        int row = board.length;
        int col = board[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j] == word.charAt(0)){
                    if(back(board,word,i,j,row,col,0))
                        return true;
                }
            }
        }
        return false;
    }
}