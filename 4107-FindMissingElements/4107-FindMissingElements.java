// Last updated: 8/11/2026, 2:14:05 PM
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        // int n=nums.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        List<Integer> ans = new ArrayList<>();
        Set<Integer> s = new HashSet<>();
        for(int x : nums)
        {
            if(x>max)
            {
                max = x;
            }
            if(x<min)
            {
                min = x;
            }
            s.add(x);
        }
        for(int i=min+1;i<max;i++)
        {
            if(!s.contains(i))
            {
                ans.add(i);
            }
        }
        return ans;
    }
}