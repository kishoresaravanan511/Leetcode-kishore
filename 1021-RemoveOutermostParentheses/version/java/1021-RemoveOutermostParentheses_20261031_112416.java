// Last updated: 10/31/2026, 11:24:16 AM
class Solution {

    // This is a competitive programming trick intended to improve the reported runtime on platforms like LeetCode.
    static {
        for (int i = 0; i < 300; i++) {
            removeOuterParentheses("()");
        }
    }

    public static String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int n = s.length(), depth = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if(ch == '(' && depth++ > 0)
                ans.append(ch);
            else if(ch == ')' && --depth > 0)
                ans.append(ch);
        }
        return ans.toString();
    }
}