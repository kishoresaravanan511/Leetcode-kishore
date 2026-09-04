// Last updated: 9/4/2026, 9:26:44 PM
1class Solution {
2    public int getCommon(int[] nums1, int[] nums2) {
3        int p1 = 0;
4        int p2 = 0;
5        //important it is sorted , so it is simple pointer..
6        while(p1 < nums1.length && p2 < nums2.length)
7        {
8            if(nums1[p1] == nums2[p2])
9            {
10              return nums1[p1];
11            }
12            else if(nums1[p1] < nums2[p2]) 
13            {
14                p1++;
15            }
16            else
17            {
18                p2++;
19            }
20        }  
21        return -1;
22    }
23}