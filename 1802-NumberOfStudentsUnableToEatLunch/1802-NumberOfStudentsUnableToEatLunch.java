// Last updated: 8/11/2026, 2:15:28 PM
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> st = new Stack<>();  //for sandwiches.
        Queue<Integer> q = new LinkedList<>();  //for students.
        //int t=0;
        //store sandwiches in stack in order of 0th element in top of the stack. 
        for(int i=sandwiches.length-1;i>=0;i--)
        {
            st.push(sandwiches[i]);  //store sandwiches
        } 
        for(int s: students)
        {
            q.add(s);   //store students
        }
        int t=0;
        while(!q.isEmpty() && !st.isEmpty() && t<st.size())   //until queue and stack is empty
        {
            if(q.peek() == st.peek())
            {
                q.poll();
                st.pop();
                t=0;   //sale happens waiting time is 0
            }
            else
            {
                t++;   //count the no of students rejects particular type of sandwich
                q.add(q.poll());
            }
        }
        return q.size();
    }
}