// Last updated: 8/11/2026, 4:15:36 PM
class Solution {
    public int missingInteger(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int prefix = nums[0];

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i] == nums[i-1]+1)  //it is a sequence..
            {
                prefix+=nums[i];
            }
            else
            {
                break;
            }
        }
        for(int x : nums)
        {
            s.add(x);
        }
        while(s.contains(prefix))
        {
            prefix++;
        }
        return prefix;
    }
}