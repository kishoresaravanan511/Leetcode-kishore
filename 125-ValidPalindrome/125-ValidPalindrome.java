// Last updated: 8/11/2026, 2:22:32 PM
class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty())     return true;

        int p1 = 0;
        int p2 = s.length()-1;

        while(p1<=p2)
        {
            int currFirst = s.charAt(p1);
            int currLast = s.charAt(p2);

            if(!Character.isLetterOrDigit(currFirst))
                    p1++;
            else if(!Character.isLetterOrDigit(currLast))
                    p2--;
            else
            {
                if(Character.toLowerCase(currFirst) != Character.toLowerCase(currLast))
                    return false;
                p1++;
                p2--;
            }
        }
        return true;
        
    }
}