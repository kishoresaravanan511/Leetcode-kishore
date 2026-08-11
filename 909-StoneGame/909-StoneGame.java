// Last updated: 8/11/2026, 2:16:55 PM
class Solution {
    public boolean stoneGame(int[] piles) {
       int n = piles.length;
       int i=1;
       int a = 0;
       int b = 0;

       while(i<n)
       {
            a += Math.max(piles[i-1],piles[n-i]);
          
            b += Math.min(piles[i-1],piles[n-i]);

            i++;
       } 
       if(a>b)
       {
        return true;
       }
       return false;
    }
}