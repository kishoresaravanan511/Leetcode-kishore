// Last updated: 10/14/2026, 10:56:19 PM
1class Solution {
2    public String removeOuterParentheses(String s) {
3        StringBuilder ans = new StringBuilder();
4        int count = 0;
5
6        for (char c : s.toCharArray()) {
7            if (c == '(') {
8                if (count > 0)
9                    ans.append(c);
10                count++;
11            } else {
12                count--;
13                if (count > 0)
14                    ans.append(c);
15            }
16        }
17
18        return ans.toString();
19    }
20}