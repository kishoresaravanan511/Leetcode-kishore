// Last updated: 8/11/2026, 2:18:20 PM
class Solution {
    public boolean checkInclusion(String s1, String s2) {

       if(s1.length() > s2.length())    return false;

       int k = s1.length();
       int[] freq = new int[26];
       int[] windowFreq = new int[26];
       int n = s2.length();
       for(int i=0;i<s1.length();i++)
       {
            freq[s1.charAt(i)-'a']++;
       }

       for(int i=0;i<k;i++)
       {
            windowFreq[s2.charAt(i)-'a']++;
       }
       if(Arrays.equals(windowFreq,freq))
       {
            return true;
       }

       for(int i=k;i<n;i++)
       {
            windowFreq[s2.charAt(i-k)-'a']--;
            windowFreq[s2.charAt(i)-'a']++;

            if(Arrays.equals(windowFreq,freq))
            {
                return true;
            }
       }
       return false;
    }
}