// Last updated: 9/5/2026, 9:18:16 PM
1class Solution {
2    public int firstUniqChar(String s) {
3        int[] freq = new int[256];
4        for(int i=0;i<s.length();i++)
5        {
6            char ch = s.charAt(i);
7            freq[ch]++;
8        }
9    
10        for(int i=0;i<s.length();i++)
11        { 
12            //important, we check the frequency with the order of 's' not index based.  that's why array size is 256 for unicode characters.
13            char ch = s.charAt(i);
14            if(freq[ch]==1)   //first occured..
15                return i;
16        }
17        return -1;
18    }
19}