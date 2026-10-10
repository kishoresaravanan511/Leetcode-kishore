// Last updated: 10/10/2026, 9:53:22 PM
1class Solution {
2    public int minDistance(String word1, String word2) {
3        int m = word1.length();
4        int n = word2.length();
5        if(m==0)
6            return n;
7        if(n==0)
8            return m;
9        int[][] arr = new int[m+1][n+1];
10        
11        for(int i=0;i<=m;i++){
12            for(int j=0;j<=n;j++){
13                if(i==0)
14                    arr[i][j]=j;
15                else if(j==0)
16                    arr[i][j] = i;
17                else if(word1.charAt(i-1)==word2.charAt(j-1))
18                    arr[i][j] = arr[i-1][j-1];
19                else
20                    arr[i][j] = 1 + Math.min(arr[i-1][j-1], Math.min(arr[i-1][j], arr[i][j-1]));
21            }
22        }
23        return arr[m][n];
24    }
25}