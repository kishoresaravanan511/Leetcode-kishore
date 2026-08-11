// Last updated: 8/11/2026, 2:19:46 PM
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<1)
            return false;
        if(n==1)
            return true;

        while(n%3==0)
            n=n/3;

        if(n==1)
            return true;
        else
            return false;
    }
}