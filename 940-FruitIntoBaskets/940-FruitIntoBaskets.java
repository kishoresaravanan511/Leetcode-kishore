// Last updated: 8/11/2026, 2:16:48 PM
class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int max = 0;
        Map<Integer,Integer> m = new HashMap<>();

        for(int right=0;right<fruits.length;right++)
        {
            m.put(fruits[right],m.getOrDefault(fruits[right],0)+1);

            while(m.size() > 2)
            {
                m.put(fruits[left],m.get(fruits[left])-1);

                if(m.get(fruits[left]) == 0)
                {
                    m.remove(fruits[left]);
                }
                left++;
            }
            max = Math.max(max,right-left+1);
        }
        return max;
    }
}