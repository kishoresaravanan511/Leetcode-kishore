// Last updated: 9/24/2026, 9:55:19 PM
1class Solution {
2    public int[] dailyTemperatures(int[] temperatures) {
3        int n = temperatures.length;
4        Stack<Integer> st = new Stack<>();  //for only stores index and make decisions w.r to index.
5        int[] ans = new int[n];
6        // only index is stored in stack , not valuess..
7        for(int i=0;i<temperatures.length;i++)
8        {
9            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()])
10            {
11                ans[st.peek()] = i - st.peek();  //stores the differenece of i-peek in peek index for until only one element in stack.
12                st.pop();
13            }
14            st.push(i);   //in all case first element is pushed to int stack
15        }
16        return ans;   //in final ans array 0 are comes by integer default value , it is not manual,once for loop completes ,balance index should be zero.
17    }
18} 