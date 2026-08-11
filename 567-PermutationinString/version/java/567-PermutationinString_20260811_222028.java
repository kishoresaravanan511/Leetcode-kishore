// Last updated: 8/11/2026, 10:20:28 PM
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3
4        if(s1.length() > s2.length())   return false;
5        int[] freq = new int[26];
6        int k = s1.length();
7        int n = s2.length();
8        int[] windowFreq = new int[26];
9        for(int i=0;i<k;i++)
10        {
11            freq[s1.charAt(i)-'a']++;
12        }
13        for(int i=0;i<k;i++)
14        {
15            windowFreq[s2.charAt(i)-'a']++;
16        }
17        if(Arrays.equals(windowFreq,freq))
18        {
19            return true;
20        }
21
22        for(int i=k;i<n;i++)
23        {
24            windowFreq[s2.charAt(i-k)-'a']--;
25            windowFreq[s2.charAt(i)-'a']++;
26
27            if(Arrays.equals(windowFreq,freq))
28            {
29                return true;
30            }
31        }
32        return false;
33    }
34}