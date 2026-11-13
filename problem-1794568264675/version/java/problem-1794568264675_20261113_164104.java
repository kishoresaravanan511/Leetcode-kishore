// Last updated: 11/13/2026, 4:41:04 PM
class Solution {
    public String toLowerCase(String s) {
        char[] chars = s.toCharArray();
        
        for (int i = 0; i < chars.length; i++) {
            // Check if the character falls within the uppercase ASCII range
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                // Convert to lowercase by adding the offset difference
                chars[i] = (char) (chars[i] + 32);
            }
        }
        
        return new String(chars);
    }
}
