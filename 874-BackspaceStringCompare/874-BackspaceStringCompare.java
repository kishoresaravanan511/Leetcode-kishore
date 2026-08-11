// Last updated: 8/11/2026, 2:17:11 PM
class Solution {
    public boolean backspaceCompare(String s, String t) {

        char[] arr = s.toCharArray();
        char[] arr1 = t.toCharArray();
        Stack<Character> st = new Stack<>();
        Stack<Character> st1 = new Stack<>();

        for(char ch : arr)
        {
            if(ch=='#')
            {
                if(!st.isEmpty())
                {
                    st.pop();
                }
            }  
            else
            {
                st.push(ch);
            }
        }
        String x = String.valueOf(st);
        for(char c : arr1)
        {
            if(c == '#')
            {
                if(!st1.isEmpty())
                {
                    st1.pop();
                }
            }
            else
            {
                st1.push(c);
            }
        }
        String y = String.valueOf(st1);
        if(x.equals(y))   return true;
        return false;
    }
}