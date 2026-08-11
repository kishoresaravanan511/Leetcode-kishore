// Last updated: 8/11/2026, 2:21:20 PM
class Solution {
    public boolean isHappy(int n) {
        int d,res;
        while(n!=1 && n!=4)
        {
            res=0;
        while(n!=0)
        {
            d=n%10;
            res = res + (d*d);
            n/=10;
        }
        n=res;
        }
        if(n==1)
            return true;
        else
            return false;
    }
}