// Last updated: 8/11/2026, 2:19:28 PM
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        if(nums1 == null || nums1.length==0 || nums2 == null || nums2.length ==0)   return new int[0];

        int p1 =0;
        int p2 = 0;

        List<Integer> l = new ArrayList<>();
        while(p1 < nums1.length && p2 < nums2.length)
        {
            if(nums1[p1] == nums2[p2])
            {
                l.add(nums1[p1]);
                p1++;
                p2++;
            }
            else if(nums1[p1] < nums2[p2])
            {
                p1++;
            }
            else
            {
                p2++;
            }

        }
        return listToArray(l);
    }
    int[] listToArray(List<Integer> res)
    {
        int[] ans = new int[res.size()];

        for(int i=0;i<ans.length;i++)
        {
            ans[i] = res.get(i);
        }
        return ans;
    }
}