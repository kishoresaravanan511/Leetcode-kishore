// Last updated: 8/31/2026, 8:31:48 PM
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        ArrayList<Integer> aL = new ArrayList<>();
4        HashSet<Integer> hS = new HashSet<>();
5
6        for(int x:nums1)
7        {
8            hS.add(x);
9        }
10        
11        for(int y:nums2)
12        {
13            if(hS.contains(y))
14            {
15                aL.add(y);
16                hS.remove(y);   //removes key 
17            }
18        }
19
20        int[] res = new int[aL.size()];
21
22        for(int i=0;i<res.length;i++)
23            res[i] = aL.get(i);
24
25        return res;
26    }
27}