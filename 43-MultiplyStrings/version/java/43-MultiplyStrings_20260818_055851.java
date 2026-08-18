// Last updated: 8/18/2026, 5:58:51 AM
1class Solution {
2    public String multiply(String num1, String num2) {
3        int m = num1.length();
4        int n = num2.length();
5        int[] pos = new int[m + n];
6
7        for (int i = m - 1; i >= 0; i--) {
8            for (int j = n - 1; j >= 0; j--) {
9                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
10                int p1 = i + j;
11                int p2 = i + j + 1;
12                int sum = mul + pos[p2];
13
14                pos[p2] = sum % 10;
15                pos[p1] += sum / 10;
16            }
17        }
18
19        StringBuilder sb = new StringBuilder();
20        for (int p : pos) {
21            if (!(sb.length() == 0 && p == 0)) {
22                sb.append(p);
23            }
24        }
25
26        return sb.length() == 0 ? "0" : sb.toString();
27    }
28}
29
30