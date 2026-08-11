// Last updated: 8/11/2026, 2:19:40 PM
class Solution {
    public void reverseString(char[] s) {
       int st=0,en=s.length-1;
       int i;
       while(st<en)
       {
        char temp = s[st];
        s[st] = s[en];
        s[en] = temp;
        st++;
        en--;
       }
       for(i=0;i<s.length-1;i++)
            System.out.print(s[i]);
    }
}