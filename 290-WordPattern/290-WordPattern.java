// Last updated: 8/11/2026, 2:20:02 PM
import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        // Length check
        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> map1 = new HashMap<>(); // pattern → word
        HashMap<String, Character> map2 = new HashMap<>(); // word → pattern

        for (int i = 0; i < pattern.length(); i++) {

            char p = pattern.charAt(i);
            String w = words[i];

            if (map1.containsKey(p)) {
                if (!map1.get(p).equals(w)) {
                    return false;
                }
            } else {
                map1.put(p, w);
            }

            if (map2.containsKey(w)) {
                if (map2.get(w) != p) {
                    return false;
                }
            } else {
                map2.put(w, p);
            }
        }

        return true;
    }
}
