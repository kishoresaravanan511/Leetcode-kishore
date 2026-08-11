// Last updated: 8/11/2026, 2:17:44 PM
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        // only index is stored in stack , not valuess..
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()])
            {
                ans[st.peek()] = i - st.peek();
                st.pop();
            }
            st.push(i);
        }
        return ans;
    }
} 