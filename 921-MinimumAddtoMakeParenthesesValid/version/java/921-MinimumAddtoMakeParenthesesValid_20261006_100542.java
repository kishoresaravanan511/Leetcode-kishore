// Last updated: 10/6/2026, 10:05:42 AM
1class Solution {
2    public int minAddToMakeValid(String s) {
3        Stack<Character> st = new Stack<>();   //contains only open braces 
4        int count = 0;   //for count open braces needed
5        char[] arr = s.toCharArray();
6
7        for(char c : arr)
8        {
9            if(c == '(')    st.push(c);   //for open braces.
10            else{
11                if(st.isEmpty())   count++;    //for closed braces in start position.
12                else    st.pop();
13            }
14        }
15        return count + st.size();
16    }
17}