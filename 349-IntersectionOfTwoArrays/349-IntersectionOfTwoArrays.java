// Last updated: 8/11/2026, 2:19:29 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> aL = new ArrayList<>();
        HashSet<Integer> hS = new HashSet<>();

        for(int x:nums1)
        {
            hS.add(x);
        }
        
        for(int y:nums2)
        {
            if(hS.contains(y))
            {
                aL.add(y);
                hS.remove(y);
            }
        }

        int[] res = new int[aL.size()];

        for(int i=0;i<res.length;i++)
            res[i] = aL.get(i);

        return res;
        
    }
}