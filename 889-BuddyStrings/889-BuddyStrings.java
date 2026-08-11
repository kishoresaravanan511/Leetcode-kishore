// Last updated: 8/11/2026, 2:17:08 PM
class Solution {
    public boolean buddyStrings(String s, String goal) {
            if(s.length() != goal.length())     return false;

            if(s.equals(goal))
            {
                HashSet<Character> uniqueChars = new HashSet<>();
                for(char c : s.toCharArray())
                {
                    uniqueChars.add(c);
                }
                return uniqueChars.size() < s.length();
            }

            List<Integer> diffInd = new ArrayList<>();
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i) != goal.charAt(i))
                    diffInd.add(i);
            }

            if(diffInd.size() != 2)
                return false;

            int first = diffInd.get(0);
            int second = diffInd.get(1);

            return s.charAt(first) == goal.charAt(second)  &&  s.charAt(second) ==  goal.charAt(first);
    }
}