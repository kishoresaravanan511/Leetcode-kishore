// Last updated: 9/5/2026, 9:30:38 PM
1class Solution {
2    public int lengthOfLastWord(String s) {
3        // int i = s.length() - 1;
4        // int length=0;
5
6        // while(i>=0 && s.charAt(i) == ' ')
7        //     i--;
8
9        // while(i>=0 && s.charAt(i)!=' ')
10        // {
11        //     i--;
12        //     length++;
13        // }
14        // return length;
15
16        String[] cleaned = s.split(" ");
17        int n = cleaned.length-1;
18        return cleaned[n].length();
19    }
20}