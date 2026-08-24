// Last updated: 8/24/2026, 9:40:02 PM
1class Solution {
2    public boolean canTransform(String start, String result) {
3       int n = start.length();
4       int i=0,j=0;
5       if(start.length() != result.length())
6        return false;
7
8       while(i<n || j<n)
9       {
10        while(i<n && start.charAt(i)=='X')
11        {
12            i++;
13        }
14        while(j<n && result.charAt(j)=='X')
15        {
16            j++;
17        }
18        if(i==n || j==n)
19            return i==n && j==n;
20        
21        if(start.charAt(i)!=result.charAt(j))
22            return false;
23
24        if(start.charAt(i)=='L' && i<j)
25            return false;
26        
27        if(start.charAt(i)=='R' && i>j)
28            return false;
29
30        i++;
31        j++;
32       } 
33       return true;
34    }
35}