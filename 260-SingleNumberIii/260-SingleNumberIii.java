// Last updated: 8/11/2026, 2:20:27 PM
class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        List<Integer> l = new ArrayList<>();

        for(int x:nums)
        {
            m.put(x,m.getOrDefault(x,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : m.entrySet())
        {
            if(entry.getValue() == 1)
            {
                l.add(entry.getKey());
            }
        }
        int[] res = new int[l.size()];
        for(int i=0;i<l.size();i++)
        {
            res[i] = l.get(i);
        }
        return res;
    }
}