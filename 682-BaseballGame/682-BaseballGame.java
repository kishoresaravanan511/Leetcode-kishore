// Last updated: 8/11/2026, 2:17:57 PM
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        //int sum = 0;
        
        for(String s : operations)
        {
            if(s.equals("C"))
            {
                    st.pop();
            }
            else if(s.equals("D"))
            {
                st.push(2*st.peek());  //peek element * 2 and stores to stack 
            }
            else if(s.equals("+"))
            {
                if(st.size() < 2)   
                {
                    continue;
                }
                    int a = st.pop();
                    int b = st.peek();  // dont use pop() because it delete the top element , only use peek()

                    //maintain this order
                    st.push(a);  //restoring
                    st.push(a+b);   //new record.
            }
            else
            {
                st.push(Integer.parseInt(s));
            }
        }
        int sum =0;
        while(!st.isEmpty())
        {
            sum+=st.pop();
        }
        return sum;
    }
}