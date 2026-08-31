// Last updated: 8/31/2026, 12:33:32 PM
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        //filling back to front .
4        int p1 = m-1;
5        int p2 = n-1;
6        int p = m+n-1;
7
8        while(p1>=0 && p2>=0)
9        {
10            if(nums1[p1] > nums2[p2])
11            {
12                nums1[p] = nums1[p1];
13                p1--;
14            }
15            else
16            {
17                nums1[p] = nums2[p2];
18                p2--;
19            }
20            p--;
21        }
22        //edge case for balance elements in nums2 array.
23
24        while(p1>=0)
25        {
26            nums1[p] = nums1[p1];
27            p1--;
28            p--;
29        }
30        while(p2>=0)
31        {
32            nums1[p] = nums2[p2];
33            p2--;
34            p--;
35        }
36    }
37}