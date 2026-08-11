// Last updated: 8/11/2026, 2:16:40 PM
class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();   //contains only open braces 
        int count = 0;   //for count open braces needed
        char[] arr = s.toCharArray();

        for(char c : arr)
        {
            if(c == '(')    st.push(c);   //for open braces.
            else{
                if(st.isEmpty())   count++;    //for closed braces in start position.
                else    st.pop();
            }
        }
        return count + st.size();
    }
}