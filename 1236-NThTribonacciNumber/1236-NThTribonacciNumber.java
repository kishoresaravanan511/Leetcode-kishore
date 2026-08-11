// Last updated: 8/11/2026, 2:16:14 PM
class Solution {
    public int tribonacci(int n) {
        int n1=0,n2=1,n3=1,n4=0,i;
        if(n==0 || n==1)
            return n;
        else
        {
            for(i=3;i<=n;i++)
            {
            n4=n1+n2+n3;
            n1=n2;
            n2=n3;
            n3=n4;
            }
        }
        return n3;
    }
}