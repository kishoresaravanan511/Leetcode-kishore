// Last updated: 10/30/2026, 11:21:19 PM
1class Solution {
2    public int calPoints(String[] operations) {
3        Stack<Integer> st = new Stack<>();
4        for(String s : operations)
5        {
6            if(s.equals("C"))
7            {
8                st.pop();
9            }
10            else if(s.equals("D"))
11            {
12                st.push(2*st.peek());  //peek element * 2 and stores to stack 
13            }
14            else if(s.equals("+"))
15            {
16                if(st.size() < 2)   
17                {
18                    continue;
19                }
20                int a = st.pop();
21                int b = st.peek();  //dont use pop() because it delete the top element , only use peek()
22
23                //maintain this order
24                st.push(a);  //restoring
25                st.push(a+b);   //new record.
26            }
27            else
28            {
29                st.push(Integer.parseInt(s));   //store the integer to stack
30            }
31        }
32        int sum =0;
33        while(!st.isEmpty())  //iterating stack
34        {
35            sum+=st.pop();  
36        }
37        return sum;
38    }
39}