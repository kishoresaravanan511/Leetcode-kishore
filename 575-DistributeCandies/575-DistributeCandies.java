// Last updated: 8/11/2026, 2:18:16 PM
class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        Map<Integer,Integer> m = new HashMap<>();

        for(int x : candyType)
        {
            m.put(x,m.getOrDefault(x,0)+1);
        }
        return Math.min(m.size(),n/2);
    }
}