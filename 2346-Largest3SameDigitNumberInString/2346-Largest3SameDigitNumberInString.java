// Last updated: 8/11/2026, 2:14:51 PM
class Solution {
    public String largestGoodInteger(String num) {
        char maxChar=' ';

        for(int i=0;i<=num.length()-3;i++)
        {
            char c1 = num.charAt(i);
            char c2 = num.charAt(i+1);
            char c3 = num.charAt(i+2);   
            if(c1==c2 && c2==c3)
            {
                if(c1>maxChar)
                {
                    maxChar = c1;
                }
            }
        }
        if(maxChar == ' ')
        {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<3;i++)
        {
            sb.append(maxChar);
        }
        return sb.toString();
    }
}