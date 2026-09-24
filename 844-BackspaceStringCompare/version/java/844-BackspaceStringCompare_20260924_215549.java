// Last updated: 9/24/2026, 9:55:49 PM
1class Solution {
2    public boolean backspaceCompare(String s, String t) {
3
4        char[] arr = s.toCharArray();
5        char[] arr1 = t.toCharArray();
6        Stack<Character> st = new Stack<>();
7        Stack<Character> st1 = new Stack<>();
8
9        for(char ch : arr)
10        {
11            if(ch=='#')
12            {
13                if(!st.isEmpty())
14                {
15                    st.pop();
16                }
17            }  
18            else
19            {
20                st.push(ch);
21            }
22        }
23        String x = String.valueOf(st);
24        for(char c : arr1)
25        {
26            if(c == '#')   //we not check it is not a #,instead of we check straight forward for # , if not push to stack.
27            {
28                if(!st1.isEmpty())  //for safety to cause empty stack Exception
29                {
30                    st1.pop();
31                }
32            }
33            else
34            {
35                st1.push(c);
36            }
37        }
38        String y = String.valueOf(st1);
39        
40        if(x.equals(y))   return true;  //equals() compares he actual string.
41        return false;
42    }
43}