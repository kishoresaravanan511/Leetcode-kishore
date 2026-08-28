// Last updated: 8/29/2026, 4:29:08 AM
1class Solution {
2    public int numberOfSpecialChars(String word) {
3        int n = word.length();
4        int[] freq = new int[26];
5        int[] freq1 = new int[26];
6        int ind=0;
7        int count=0;
8
9        for(char x : word.toCharArray())
10        {
11            if(Character.isLowerCase(x))
12            {
13                freq[x - 'a']++;
14            }
15            else if(Character.isUpperCase(x))
16            {
17                freq1[x-'A']++;
18            }  
19        }
20
21        for(int i=0;i<26;i++)
22        {
23            if(freq[i] >= 1 && freq1[i] >= 1)
24                count++;
25        }
26        return count;
27    }
28}