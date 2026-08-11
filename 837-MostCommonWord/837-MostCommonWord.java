// Last updated: 8/11/2026, 2:17:18 PM
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> s = new HashSet<>();
        for(String x:banned)
        {
            s.add(x);
        }
        String str = paragraph.toLowerCase().replaceAll("[,.!?';.]"," ");
        String[] arr = str.split("\\s+");
        Map<String,Integer> m = new HashMap<>();

        String mostCommon = "";
        int maxCount = 0;

        for(String word:arr)
        {
            if(word.isEmpty() || s.contains(word)){
                continue;
            }

            int count = m.getOrDefault(word,0)+1;
            m.put(word,count);

            if(count > maxCount)
            {
                maxCount = count;
                mostCommon = word;
            }
        }
        return mostCommon;
    }
}