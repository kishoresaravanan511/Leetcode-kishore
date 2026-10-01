// Last updated: 10/1/2026, 9:53:22 PM
1class Solution{
2public int reverse(int x)
3{
4    long newResult = 0;
5
6    while (x != 0)
7    {
8        int tail = x % 10;
9        newResult = newResult * 10 + tail;
10
11        //edge case
12        // if ((newResult - tail) / 10 != result)
13        // {
14        //     return 0; 
15        // }
16        //result = newResult;
17        
18        x = x / 10;
19    }
20    if(newResult > Integer.MAX_VALUE  ||  newResult < Integer.MIN_VALUE)
21    {
22        return 0;
23    }
24    return (int)newResult;
25}
26}