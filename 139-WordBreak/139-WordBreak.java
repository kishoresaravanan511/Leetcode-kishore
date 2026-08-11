// Last updated: 8/11/2026, 2:22:20 PM
public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int len = s.length();  //8
        boolean[] f = new boolean[len+1];  //[9]==> false;
        f[0] = true;   //0 = true balance false
        for (int i=1; i<len+1; i++)   //1<9;
        {
            for (int j=0; j<i; j++)  // 0<9
            {
                if (f[j] && wordDict.contains(s.substring(j,i)))
                //true && true
                {
                    f[i] = true;
                    break;
                }
            }
        }
        return f[len];
    }
}