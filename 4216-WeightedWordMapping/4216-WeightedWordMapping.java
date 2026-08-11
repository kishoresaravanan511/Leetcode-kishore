// Last updated: 8/11/2026, 2:13:59 PM
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
    //     char c = 'z';
    //     Map<Integer,Character> m = new HashMap<>();
    //     for(int i=0;i<26;i++)
    //     {
    //         m.put(i,c);
    //         c--;
    //     }
    //     Map<Character,Integer> m1 = new HashMap<>();
    //     char ch = 'a';
    //     int sum=0;
    //     for(int i=0;i<26;i++)
    //     {
    //         m1.put(ch,weights[i]);
    //         ch++;
    //     }
    //     StringBuilder sb = new StringBuilder();
    //     for(int i=0;i<words.length;i++)
    //     {
    //         String dummy = words[i];

    //         for(char x : dummy.toCharArray())
    //         {
    //             sum+=m1.get(x);
    //         }
    //         sb.append((char)m.get(sum%26));
    //         sum=0;
    //     }
    //     return sb.toString();
    // }
    int s=0;
    StringBuilder sb = new StringBuilder(words.length);
    for(String x : words)
    {
        s=0;
        for(int i=0;i<x.length();i++)
        {
            s+=weights[x.charAt(i)-'a'];
        }
        sb.append((char)('z' - (s%26)));
    }
    return sb.toString();
    }
}