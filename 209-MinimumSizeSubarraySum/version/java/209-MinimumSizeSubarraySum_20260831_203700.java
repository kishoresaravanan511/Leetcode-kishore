// Last updated: 8/31/2026, 8:37:00 PM
1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3
4        //for two pointers approach only array is sorted for this approach.
5        Arrays.sort(nums1);
6        Arrays.sort(nums2);
7
8        if(nums1 == null || nums1.length==0 || nums2 == null || nums2.length ==0)   return new int[0];   //edge cases..
9
10        //Two pointers..
11        int p1 = 0;
12        int p2 = 0;
13
14        List<Integer> l = new ArrayList<>();
15        while(p1 < nums1.length && p2 < nums2.length)
16        {
17            if(nums1[p1] == nums2[p2])
18            {
19                l.add(nums1[p1]);  //add to list
20                p1++;
21                p2++;
22            }
23            else if(nums1[p1] < nums2[p2])
24            {
25                p1++;  
26            }
27            else
28            {
29                p2++;
30            }
31
32        }
33        return listToArray(l);
34    }
35    int[] listToArray(List<Integer> res)   //primitive array
36    {
37        int[] ans = new int[res.size()];
38
39        for(int i=0;i<ans.length;i++)
40        {
41            ans[i] = res.get(i);
42        }
43        return ans;
44    }
45}