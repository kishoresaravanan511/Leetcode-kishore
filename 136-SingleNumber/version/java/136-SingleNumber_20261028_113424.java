// Last updated: 10/28/2026, 11:34:24 AM
1class Solution {
2    public int singleNumber(int[] nums) {
3       int n = nums.length;
4       Map<Integer,Integer> m = new HashMap<>();
5
6       for(int x:nums)
7       {
8            m.put(x,m.getOrDefault(x,0)+1);
9       }
10
11        for(int a:nums)
12        {
13            if(m.get(a) ==1 )   return a;
14        }
15       
16    //    for(Map.Entry<Integer,Integer> entry : m.entrySet())
17    //    {
18    //     if(entry.getValue() == 1)
19    //     {
20    //         return entry.getKey();
21    //     }}
22       return 0;
23    }
24}