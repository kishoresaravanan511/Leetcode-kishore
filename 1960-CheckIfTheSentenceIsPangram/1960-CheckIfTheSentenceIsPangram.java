// Last updated: 8/11/2026, 2:15:17 PM
class Solution {
    public boolean checkIfPangram(String sentence) {
       int n = sentence.length();
       int[] freq = new int[26];
       for(char x:sentence.toCharArray())
       {
        freq[x-'a']++;
       } 
       boolean flag = false;
       for(int i=0;i<freq.length;i++)
       {
            if(freq[i]>=1)  
            {
                flag = true;
            }
            else
            {
                return false;
            }
       }
       return flag;
    }
}