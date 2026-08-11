// Last updated: 8/11/2026, 2:22:06 PM
class Solution {
    int calculate(int a,int b,String ch)
    {
        int ans = 0;
        switch(ch)
        {
            case "+":
                ans = a+b;
                break;
            case "-":
                ans = b-a;
                break;
            case "*":
                ans = a*b;
                break;
            case "/":
                ans = b/a;
                break;
        }
        return ans;
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(String str : tokens)
        {
            if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/"))
            {
                int a = st.pop();
                int b = st.pop();
                int ans = calculate(a,b,str);
                st.push(ans);
            }
            else
            {
                st.push(Integer.parseInt(str));
            }
        }
        return st.peek();
    }
}