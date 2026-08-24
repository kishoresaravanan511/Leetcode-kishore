// Last updated: 8/24/2026, 9:45:12 PM
1class Solution{
2public int reverse(int x)
3{
4    int result = 0;
5
6    while (x != 0)
7    {
8        int tail = x % 10;
9        int newResult = result * 10 + tail;
10
11        //edge case
12        if ((newResult - tail) / 10 != result)
13        {
14            return 0; 
15        }
16
17        result = newResult;
18        x = x / 10;
19    }
20
21    return result;
22}
23}