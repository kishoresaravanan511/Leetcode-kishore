// Last updated: 8/11/2026, 2:18:46 PM
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> fin = new ArrayList<>();

        if(p.length()>s.length())   return fin;

        int n = s.length();
        int[] freq = new int[26];
        int[] windowFreq = new int[26];
        for(char c : p.toCharArray())
        {
            freq[c-'a']++;
        }

        int k=p.length();

        for(int i=0;i<k;i++)
        {
            windowFreq[s.charAt(i)-'a']++;
            //if(windowFreq[s.charAt(x)-'a'] == freq[p.charAt(x)-'a'])
        }
        if(Arrays.equals(windowFreq,freq)) 
            fin.add(0);

        for(int i=k;i<n;i++)
        {
            windowFreq[s.charAt(i-k)-'a']--;
            windowFreq[s.charAt(i)-'a']++;

            if(Arrays.equals(windowFreq,freq))
            {
                fin.add(i-k+1);
            }
        }
        return fin;
    }
}