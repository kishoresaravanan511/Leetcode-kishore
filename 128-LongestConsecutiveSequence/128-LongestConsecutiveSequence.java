// Last updated: 8/11/2026, 2:22:28 PM
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int begin = 0;
        int length = 0;
        int max = 0;
        for(int i : nums)
        {
            s.add(i);
        }
        
        for(int x : s)
        {
            if(!s.contains(x-1))
            {
                begin = x;
                length = 1;
            }
            while(s.contains(begin+1))
            {
                begin++;
                length++;
            }
            max = Math.max(length,max);
        }
        return max;
    }
}