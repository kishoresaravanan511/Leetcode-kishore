// Last updated: 10/31/2026, 10:40:51 AM
1class Solution {
2    public boolean isValid(String s) {
3        Deque<Character> st = new ArrayDeque<>();
4        for(char c : s.toCharArray())
5        {
6            if(c =='(' || c=='{' || c=='[')
7            {
8                st.push(c);
9            }
10            else
11            {
12                if(!st.isEmpty())
13                {
14                    char prev = st.pop();
15                    if(!helper(c,prev))
16                    {
17                         return false;
18                    }   
19                }
20                else
21                {
22                    return false;
23                }
24            }
25        }
26        return st.isEmpty();
27    }
28    private boolean helper(char top,char prev)
29    {
30        if(!((prev == '(' && top == ')') || (prev == '{' && top == '}') || (prev == '[' && top == ']')))
31        {
32            return false;
33        }
34        return true;
35    }
36
37}