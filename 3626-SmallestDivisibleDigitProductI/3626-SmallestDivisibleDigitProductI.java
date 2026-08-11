// Last updated: 8/11/2026, 4:15:31 PM
class Solution {
    public int smallestNumber(int n, int t) {

        while(true)
        {
            if(productOfANumber(n)%t == 0)
            {
                return n;
            }
            n++;
        }
    }
    int productOfANumber(int n)
    {
        int pro = 1;
    
        while(n!=0)
        {
            int d = n%10;
            pro*=d;
            n/=10;

        }
        return pro;
    }
}
