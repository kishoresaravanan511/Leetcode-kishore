// Last updated: 8/11/2026, 2:23:11 PM
class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();   //for pushing only actual strings not an empty string or "." .
        StringBuilder sb = new StringBuilder(); //storing the  elements stored in stack .
        String[] arr = path.split("/"); 

        for(String str : arr)
        {
            if(str.equals("") || str.equals("."))
            {
                continue;  //skips the current iteration and go to next iteration.
            }
            else if(str.equals(".."))
            {
                if(!st.isEmpty())  //for prevent the nullpointer exception edge case.
                {
                    st.pop();
                }
            }
            else
            {
                st.push(str);
            }
        }

        if(st.isEmpty())
            sb.append("/");
            
        for(String x : st)
        {
            sb.append("/");
            sb.append(x);
        }    

        return sb.toString();  //  (or) String.valueOf(sb);
    }
}