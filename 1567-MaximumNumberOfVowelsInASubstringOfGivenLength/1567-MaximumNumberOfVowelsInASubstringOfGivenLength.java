// Last updated: 8/11/2026, 2:15:55 PM
class Solution {
    public int maxVowels(String s, int k) {  //need to optimize
    //    int n = s.length();
    //    int c=0;
    //    int max = 0;
    //    String vow = "aeiouAEIOU";

    //    for(int i=0;i<k;i++)
    //    {
    //        if(vow.indexOf(s.charAt(i)) != -1)
    //        {
    //             c++;
    //        }
    //    } 
    //    max = c;

    //    int st = 0;
    //    int end = k;

    //    while(end<n)
    //    {
    //         if(vow.indexOf(s.charAt(st)) != -1)
    //         {
    //             c--;
    //         }
    //         st++;
    //         if(vow.indexOf(s.charAt(end)) != -1)
    //         {
    //             c++;
    //         }
    //         end++;

    //         max = Math.max(c,max);
    //    }
    //    return max;

    int n = s.length();
    int max = 0;
    int c=0;
    for(int i=0;i<k;i++)
    {
        if(isVowel(s.charAt(i)))
            c++;
    }
    max = c;

    for(int i=k;i<n;i++)
    {
        if(isVowel(s.charAt(i-k)))
        {
            c--;
        }
        if(isVowel(s.charAt(i)))
        {
            c++;
        }
        max = Math.max(c,max);
    }
    return max;
    }
    boolean isVowel(char c)
    {
        //char ch = c.toLowerCase();
        switch(c)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
        }
        return false;
        
    }
}