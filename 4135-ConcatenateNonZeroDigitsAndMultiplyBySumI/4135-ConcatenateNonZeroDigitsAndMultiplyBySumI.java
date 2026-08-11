// Last updated: 8/11/2026, 2:14:04 PM
class Solution {
    public long sumAndMultiply(int n) {
        long len = 1;
        long sum = 0;
        long x = 0;

        while(n!=0)
        {
            x = (n%10) * len+x;

            if(n%10 !=0)    len = len*10;
            sum += n%10;
            n/=10;
        }
        return sum*x;
    }
}