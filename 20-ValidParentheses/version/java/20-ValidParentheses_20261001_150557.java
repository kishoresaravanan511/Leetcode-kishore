// Last updated: 10/1/2026, 3:05:57 PM
1class Solution {
2    boolean isMatch(char ch , char top)
3    {
4        if((ch == ')' && top == '(') || (ch == '}' && top == '{') || ch == ']' && top == '[')  //top only stores open braces because it is a condition to push to a stack
5        {
6            return true;
7        }
8        return false;
9    }
10    public boolean isValid(String s) {
11        char[] arr = s.toCharArray();
12        Stack<Character> st = new Stack<>();
13
14        for(char ch : arr)
15        {
16            if((ch == '(') || (ch == '{') || (ch == '['))
17            {
18                st.push(ch);
19            }
20            else
21            {
22                if(st.isEmpty())    return false;
23
24                char top = st.pop();
25
26                //not match , false ,else check others
27                if(!isMatch(ch,top)) 
28                {
29                    return false;
30                }
31            }
32        }
33        if(!st.isEmpty())  
34            return false;
35        return true; 
36    }
37}