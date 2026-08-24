// Last updated: 8/24/2026, 9:41:33 PM
1class Solution{
2public int reverse(int x)
3{
4    int result = 0;
5
6    while (x != 0)
7    {
8        int tail = x % 10;
9        int newResult = result * 10 + tail;
10        if ((newResult - tail) / 10 != result)
11        {
12            return 0; 
13        }
14
15        result = newResult;
16        x = x / 10;
17    }
18
19    return result;
20}
21}