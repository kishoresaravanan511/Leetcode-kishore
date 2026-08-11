// Last updated: 8/11/2026, 2:15:12 PM
class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length()<3)   return 0;
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        //int i=0;int j=0;
        int  k=3;
        int c=0;
        for(int i=0;i<k;i++)
        {
            sb.append(s.charAt(i));
        }
        if(isFreq(sb.toString()))
        {
            c++;
        }
        for(int j=k;j<n;j++)
        {
            sb.deleteCharAt(0);
            sb.append(s.charAt(j));
            if(isFreq(sb.toString()))
            {
                c++;
            }
        }
        return c;
    }
    boolean isFreq(String str)
    {
        boolean flag = false;
        Map<Character,Integer> m = new HashMap<>();
        for(char c:str.toCharArray())
        {
            m.put(c,m.getOrDefault(c,0)+1);
        }
        return m.size()==3;
    }
}