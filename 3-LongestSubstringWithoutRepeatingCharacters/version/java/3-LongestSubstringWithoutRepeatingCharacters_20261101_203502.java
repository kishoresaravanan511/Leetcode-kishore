// Last updated: 11/1/2026, 8:35:02 PM
1public class Solution {
2    public boolean wordBreak(String s, List<String> wordDict) {
3        int len = s.length();  //8
4        boolean[] f = new boolean[len+1];  //[9]==> false;
5        f[0] = true;   //0 = true balance false
6        for (int i=1; i<len+1; i++)   //1<9;
7        {
8            for (int j=0; j<i; j++)  // 0<9
9            {
10                if (f[j] && wordDict.contains(s.substring(j,i)))
11                //true && true
12                {
13                    f[i] = true;
14                    break;
15                }
16            }
17        }
18        return f[len];
19    }
20}