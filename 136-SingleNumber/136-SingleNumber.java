// Last updated: 8/11/2026, 2:22:25 PM
class Solution {
    public int singleNumber(int[] nums) {
       int n = nums.length;
       Map<Integer,Integer> m = new HashMap<>();

       for(int x:nums)
       {
            m.put(x,m.getOrDefault(x,0)+1);
       }

        for(int a:nums)
        {
            if(m.get(a) ==1 )   return a;
        }
       
    //    for(Map.Entry<Integer,Integer> entry : m.entrySet())
    //    {
    //     if(entry.getValue() == 1)
    //     {
    //         return entry.getKey();
    //     }}
       return 0;
    }
}