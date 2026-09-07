// Last updated: 9/7/2026, 7:21:35 PM
1class Solution {
2
3    int value(char c)
4    {
5        switch(c)
6        {
7            case 'I' : return 1;
8            case 'V' : return 5;
9            case 'X' : return 10;
10            case 'L' : return 50;
11            case 'C' : return 100;
12            case 'D' : return 500;
13            case 'M' : return 1000;
14        }
15    return 0;
16    }
17    public int romanToInt(String s) {
18    int res = 0;
19    for(int i=0;i<s.length();i++)
20    {
21        char c = s.charAt(i);
22        if(i+1 < s.length())  //next is avail r not
23        {
24            char next = s.charAt(i+1);   //next character.
25
26            if(value(c) >= value(next))
27            {
28                res+=value(c);
29            }
30            else
31            {
32                res+=value(next) - value(c);
33                i++;  //go to next char
34            }
35        }  
36        else{ //for final element in a string value becoz it has no next value.
37            res+=value(c);
38        }
39    }
40    return res;
41
42    }
43}