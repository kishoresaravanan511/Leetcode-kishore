// Last updated: 9/17/2026, 11:52:39 AM
1class Solution {
2    public String largestOddNumber(String num) {
3        for(int i=num.length()-1;i>=0;i--)
4        {
5            int dig = num.charAt(i)-'0';
6            if(dig%2 != 0)
7            {
8                return num.substring(0,i+1);
9            }
10        }
11        return "";
12    }
13}