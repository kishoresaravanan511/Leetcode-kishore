// Last updated: 8/11/2026, 2:17:26 PM
class Solution {
    public boolean canTransform(String start, String result) {
       int n = start.length();
       int i=0,j=0;
       if(start.length() != result.length())
        return false;

       while(i<n || j<n)
       {
        while(i<n && start.charAt(i)=='X')
        {
            i++;
        }
        while(j<n && result.charAt(j)=='X')
        {
            j++;
        }
        if(i==n || j==n)
            return i==n && j==n;
        
        if(start.charAt(i)!=result.charAt(j))
            return false;

        if(start.charAt(i)=='L' && i<j)
            return false;
        
        if(start.charAt(i)=='R' && i>j)
            return false;

        i++;
        j++;
       } 
       return true;
    }
}