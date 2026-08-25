// Last updated: 8/25/2026, 8:09:36 AM
1class Solution {
2    String[][] board;
3    List<List<String>> ans = new ArrayList<>();
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
25            List<String> l = new ArrayList<>();
26            for(String[] r:board)  //accessing each rows 
27            {
28                String temp = "";
29
30                for(String ele : r)
31                    temp+=ele;
32                l.add(temp);  //small list
33            }
34            ans.add(l); //add small list to big list
35            return;
36        }
37        for(int col = 0;col < n;col++){
38            if(isValid(row,col,n)){ 
39                board[row][col] = "Q";
40                back(row+1,n);
41                board[row][col] = ".";
42            }
43        }
44    }
45    public List<List<String>> solveNQueens(int n) {
46        board = new String[n][n];
47        for(String[] row : board)
48            Arrays.fill(row,".");
49            
50        back(0,n);
51        return ans;
52        
53    }
54} 