// Last updated: 10/31/2026, 11:29:20 AM
1class Solution {
2    public String removeOuterParentheses(String s) {
3        // StringBuilder ans = new StringBuilder();
4        // int count = 0;
5
6        // for (char c : s.toCharArray()) {
7        //     if (c == '(') 
8        //     {
9        //         if (count > 0)
10        //         {
11        //             ans.append(c);
12        //         }
13        //         count++;
14        //     } 
15        //     else 
16        //     {
17        //         count--;
18        //         if (count > 0)
19        //         {
20        //             ans.append(c);
21        //         }
22        //     }
23        // }
24
25        // return ans.toString();
26
27        Deque<Character> st = new ArrayDeque<>();
28        StringBuilder sb = new StringBuilder();
29
30        for(char c : s.toCharArray())
31        {
32            if(c == '(')
33            {
34                if(!st.isEmpty())
35                {
36                    sb.append(c);
37                }
38                st.push(c);
39            }
40            else
41            {
42                st.pop();
43                if(!st.isEmpty())
44                {
45                    sb.append(c);
46                }
47            }
48        }
49        return String.valueOf(sb);
50    }
51}