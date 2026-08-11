// Last updated: 8/11/2026, 2:18:43 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> m = new HashMap<>();

        for(int i=1;i<=n;i++)
        {
            m.put(i,0);
        }
        for(int x:nums)
        {
            m.put(x,m.get(x)+1);
        }
        List<Integer> ans = new ArrayList<>();
        
        for(Map.Entry<Integer,Integer> entry : m.entrySet())
        {
            if(entry.getValue() == 0)
            {
                ans.add(entry.getKey());
            }
        }
        return ans;
    }
}