// Last updated: 11/24/2026, 11:07:15 PM
1class Solution {
2    public int numOfStrings(String[] patterns, String word) {
3        int c = 0;
4        // for(int i=0;i<patterns.length;i++)
5        // {
6        //     if(word.contains(patterns[i]))
7        //     {
8        //         c++;
9        //     }
10        // }
11
12        for(int i=0;i<patterns.length;i++)
13        {
14            if(word.indexOf(patterns[i]) != -1)
15            {
16                c++;
17            }
18        }
19        return c;
20    }
21}