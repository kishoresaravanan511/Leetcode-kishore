// Last updated: 9/19/2026, 3:29:18 PM
1class Solution {
2    boolean isValid(char[][] board,int i,int j,char c,int n)
3    {
4        //row check
5        for(int col=0;col<n;col++)
6            if(board[i][col] == c)
7                return false;
8
9        //col check
10        for(int row=0;row<n;row++)
11            if(board[row][j] == c)
12                return false;
13
14
15        //box check  row and col size
16        int rs = i/3*3;
17        int cs = j/3*3;
18        for(int row = rs;row<rs+3;row++)
19        {
20            for(int col=cs;col<cs+3;col++)
21            {
22                if(board[row][col]==c)
23                    return false;
24            }
25        }
26        return true;
27    }
28    boolean solve(char[][] board,int n)
29    {
30        for(int i=0;i<n;i++)
31        {
32            for(int j=0;j<n;j++)
33            {
34                if(board[i][j] == '.')
35                {
36                    for(char c = '1';c<='9';c++)
37                    {
38                        if(isValid(board,i,j,c,n))
39                        {
40                            board[i][j] = c;
41                            if(solve(board,n)) //important
42                                return true;
43                            else
44                                board[i][j] = '.';
45                        }
46                    }
47                    return false;
48                }
49            }
50        }
51        return true;
52    }
53    public void solveSudoku(char[][] board) {
54        int n = board.length;
55        solve(board,n);
56    }
57}