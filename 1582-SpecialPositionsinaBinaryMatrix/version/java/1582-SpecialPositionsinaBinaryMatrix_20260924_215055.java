// Last updated: 9/24/2026, 9:50:55 PM
1class Solution {
2    public int numSpecial(int[][] mat) {
3        int m = mat.length, n = mat[0].length;
4        int[] row = new int[m];
5        int[] col = new int[n];
6        for (int i = 0; i < m; i++) {
7            for (int j = 0; j < n; j++) {
8                if (mat[i][j] == 1) {
9                    row[i]++;
10                    col[j]++;
11                }
12            }
13        }
14
15        int ans = 0;
16        for (int i = 0; i < m; i++) {
17            for (int j = 0; j < n; j++) {
18                if (mat[i][j] == 1 && row[i] == 1 && col[j] == 1) {
19                    ans++;
20                }
21            }
22        }
23
24        return ans;
25    }
26}