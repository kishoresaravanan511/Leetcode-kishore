// Last updated: 10/25/2026, 7:33:57 PM
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        Set<Integer> s = new HashSet<>();
4        int begin = 0;
5        int length = 0;
6        int max = 0;
7        for(int i : nums)
8        {
9            s.add(i);  //100,4,200,1,3,2
10        } 
11        
12        for(int x : s)  //traversing set
13        {
14            if(!s.contains(x-1))
15            {
16                begin = x;
17                length = 1;
18            }
19            while(s.contains(begin+1))
20            {
21                begin++;
22                length++;
23            }
24            max = Math.max(length,max);
25        }
26        return max;
27    }
28}