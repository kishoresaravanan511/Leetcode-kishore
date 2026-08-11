// Last updated: 8/11/2026, 2:22:48 PM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //filling back to front .
        int p1 = m-1;
        int p2 = n-1;
        int p = m+n-1;

        while(p1>=0 && p2>=0)
        {
            if(nums1[p1] > nums2[p2])
            {
                nums1[p] = nums1[p1];
                p1--;
            }
            else
            {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }
        //edge case for balance elements in nums2 array.

        while(p1>=0)
        {
            nums1[p] = nums1[p1];
            p1--;
            p--;
        }
        while(p2>=0)
        {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }
}