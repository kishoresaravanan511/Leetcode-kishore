// Last updated: 8/11/2026, 2:16:13 PM
class Solution {
    public int maxNumberOfBalloons(String text) {
        // int[] freq = new int[26];

        // for(char c : text.toCharArray())
        // {
        //     freq[c-'a']++;
        // }

        // return Math.min(Math.min(freq['b'-'a'],freq['a'-'a']),
        // Math.min(Math.min(freq['l'-'a']/2 , freq['o' - 'a']/2),freq['n' - 'a']));

        int b=0,a=0,l=0,o=0,n=0;

        for(char c : text.toCharArray())
        {
            switch(c)
            {
                case 'b':   b++;    break;
                case 'a':   a++;    break;
                case 'l':   l++;    break;
                case 'o':   o++;    break;
                case 'n':   n++;    
            }
        }
        return Math.min(Math.min(b,a),Math.min(l/2,Math.min(o/2,n)));
    }
}