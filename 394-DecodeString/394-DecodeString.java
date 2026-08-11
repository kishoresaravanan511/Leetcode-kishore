// Last updated: 8/11/2026, 2:19:11 PM
class Solution {
    public String decodeString(String str) {
       Stack<Integer> numSt = new Stack<>();
       Stack<String> st = new Stack<>();

       int n = 0;
       String s = "";

       for(char c : str.toCharArray())
       {
        if(Character.isDigit(c))
        {
            n = n*10+(c - '0');    //count no of times string to be printed
        }
        else if(Character.isAlphabetic(c))  //if it is alphabet ,  direct append to String.
        {
            s+=c;
        }
        else if(c == '[')   //we see open braces we need to store previos elements in both stacks and reassign num and s.
        {
            numSt.push(n);
            st.push(s);
            n = 0;
            s = "";
        }
        else
        {
            StringBuilder sb = new StringBuilder();
            int t = numSt.pop();
            for(int i=0;i<t;i++)
            {
                sb.append(s);
            }
            s= st.pop()+sb.toString();
        }
       } 
       return s;
    }
}