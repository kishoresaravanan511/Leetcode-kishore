// Last updated: 9/18/2026, 9:18:24 AM
1class Solution {
2    public int[] rearrangeArray(int[] nums) {
3       int n = nums.length;
4       int[] res = new int[n];
5       int i=0;
6       int j=1;
7    
8
9       //positives are in starting position and ending are at second position , so we use i as 0 and j as 1 for +ves and -ves and increment by 2;
10       for(int x : nums)
11       {
12            if(x > 0)
13            {   
14                res[i] = x;
15                i+=2;
16            }
17            else
18            {
19                res[j] = x;
20                j+=2;
21            }
22       } 
23       return res;
24    }
25}