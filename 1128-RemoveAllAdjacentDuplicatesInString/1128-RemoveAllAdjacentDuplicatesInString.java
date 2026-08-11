// Last updated: 8/11/2026, 2:16:21 PM
class Solution {
    public String removeDuplicates(String s) {
      char[] arr = s.toCharArray();
      Stack<Character> st = new Stack<>();

      for(char ch : arr)
      {
        if(!st.isEmpty() && st.peek() == ch)
        {
            st.pop();
        }
        else
        {
            st.push(ch);
        }
      }
      StringBuilder sb = new StringBuilder();

      for(char x:st)
      {
        sb.append(x);
      }
      
      return String.valueOf(sb);
    }
}