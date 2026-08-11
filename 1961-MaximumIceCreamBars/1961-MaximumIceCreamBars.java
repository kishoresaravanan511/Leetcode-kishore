// Last updated: 8/11/2026, 4:15:57 PM
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int c=0;
        for(int x : costs)
        {
            if(x > coins)
            {
                break;
            }
            else
            {
                coins-=x;
                c++;
            }
        }
        return c;
    }
}