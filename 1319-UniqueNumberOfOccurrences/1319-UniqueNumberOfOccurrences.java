// Last updated: 8/11/2026, 2:16:06 PM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> countMap = new HashMap<>();

        for(int x:arr)
        {
            countMap.put(x,countMap.getOrDefault(x,0)+1);
        }

        Set<Integer> freq = new HashSet<>(countMap.values());

        return freq.size() == countMap.size();
    }
}