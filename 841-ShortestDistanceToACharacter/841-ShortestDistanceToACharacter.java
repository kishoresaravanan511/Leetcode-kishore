// Last updated: 8/11/2026, 2:17:15 PM
class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];
        for(int i=0;i<n;i++)
        {
            int min = Integer.MAX_VALUE;
            for(int j=0;j<n;j++)
            {
                if(c==s.charAt(j))
                {
                    min = Math.min(min,Math.abs(i-j));
                }
            }
            ans[i] = min;
        }
        return ans;
    }
}