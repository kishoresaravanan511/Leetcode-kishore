// Last updated: 8/11/2026, 2:14:22 PM
class Solution {
    public int minimumPushes(String word) {
      int ans =0;
      for(int i=0;i<word.length();i++)
      {
        ans = ans+(i/8+1);
      }  
      return ans;
    }
}