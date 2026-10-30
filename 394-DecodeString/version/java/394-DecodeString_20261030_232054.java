// Last updated: 10/30/2026, 11:20:54 PM
1class Solution {
2    public String decodeString(String str) {
3       Stack<Integer> numSt = new Stack<>();  //number stack
4       Stack<String> st = new Stack<>();  //String stack.
5
6       int n = 0;  //for numbers 
7       String s = "";   //for string
8
9       for(char c : str.toCharArray())
10       {
11        if(Character.isDigit(c))
12        {
13            n = n*10+(c - '0');    //count no of times string to be printed
14        }
15        else if(Character.isAlphabetic(c))  //if it is alphabet ,  direct append to String.
16        {
17            s+=c;
18        }
19        else if(c == '[')   //we see open braces we need to store previos elements in both stacks and reassign num and s.
20        {
21            numSt.push(n);
22            st.push(s);
23            n = 0;
24            s = "";
25        }
26        else
27        {
28            StringBuilder sb = new StringBuilder();
29            int t = numSt.pop();
30            for(int i=0;i<t;i++)
31            {
32                sb.append(s);
33            }
34            s= st.pop()+sb.toString();
35        }
36       } 
37       return s;
38    }
39}