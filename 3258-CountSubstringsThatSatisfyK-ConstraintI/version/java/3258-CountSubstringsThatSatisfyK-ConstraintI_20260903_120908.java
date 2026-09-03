// Last updated: 9/3/2026, 12:09:08 PM
1class Solution {
2    public int countKConstraintSubstrings(String s, int k) {
3        int n = s.length();
4        int ones = 0;
5        int zeroes = 0;
6        int left = 0;
7        int c=0;
8
9        for(int right=0;right<n;right++)
10        {
11            if(s.charAt(right) == '1')    
12                ones++;
13            else    
14                zeroes++;
15
16            while(ones > k  && zeroes > k)
17            {
18                if(s.charAt(left) == '0') {
19                    zeroes--;
20                }
21                else {   
22                    ones--;   
23                }
24                left++; 
25            }
26            c+=right-left+1;
27        }
28        return c;
29    }
30}