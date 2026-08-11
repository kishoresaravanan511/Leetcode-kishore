// Last updated: 8/11/2026, 2:21:51 PM
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> m = new HashMap<>();
        for(int x:nums)
        {
            m.put(x,m.getOrDefault(x,0)+1);
        }    

        for(Map.Entry<Integer,Integer> entry : m.entrySet())
        {
            if(entry.getValue() > n/2)
            {
                return entry.getKey();
            }
        }
        return 0;
    }
}