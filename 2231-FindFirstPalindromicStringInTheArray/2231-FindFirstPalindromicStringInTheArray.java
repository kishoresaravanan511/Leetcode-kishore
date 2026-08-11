// Last updated: 8/11/2026, 2:14:55 PM
class Solution {
    public String firstPalindrome(String[] words) {
        int i=0;
        for(i=0;i<words.length;i++)
        {
            if(isPalindrome(words[i]))
            {
                return words[i];
            }
        }
        return "";
        
    }
    public boolean isPalindrome(String str)
    {
        int i=0;
        int j=str.length()-1;

        char[] ch = str.toCharArray();

        while(i<=j)
        {
            if(ch[i] != ch[j])
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}