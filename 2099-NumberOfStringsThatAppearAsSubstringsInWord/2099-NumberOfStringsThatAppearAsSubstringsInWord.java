// Last updated: 8/11/2026, 2:15:09 PM
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int c = 0;
        // for(int i=0;i<patterns.length;i++)
        // {
        //     if(word.contains(patterns[i]))
        //     {
        //         c++;
        //     }
        // }

        for(int i=0;i<patterns.length;i++)
        {
            if(word.indexOf(patterns[i]) != -1)
            {
                c++;
            }
        }
        return c;
    }
}