// Last updated: 8/11/2026, 2:20:54 PM
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        Set<Integer> s = new HashSet<>();

        for(int i=0;i<n;i++)
        {
            if(s.contains(nums[i]))
            {
                return true;
            }
            //anyway store the curr element.
            s.add(nums[i]);

            if(s.size()>k)
            {
                s.remove(nums[i-k]);
            }
        }
        return false;
    }
}