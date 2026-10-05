// Last updated: 10/5/2026, 11:20:13 AM
1class Solution {
2    public int scoreOfParentheses(String s) {
3        Stack<Integer> st = new Stack<>();
4        st.push(0);
5        for(char c : s.toCharArray())
6        {
7            if(c == '(')
8            {
9                st.push(0);
10            }
11            else
12            {
13                int inner = st.pop();
14                int score = 0;
15                if(inner == 0)
16                {
17                    score = 1;
18                }
19                else
20                {
21                    score = 2 * inner;
22                }
23                st.push(score + st.pop());
24            }
25        }
26        return st.peek();
27    }
28    private boolean helper(char st,char end)
29    {
30        if(st == '(' && end == ')')
31        {
32            return true;
33        }
34        return false;
35    }
36}