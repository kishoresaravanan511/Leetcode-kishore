// Last updated: 8/11/2026, 2:16:28 PM
class Solution {
    public int fib(int n) {
        if(n<=1)    return n;
        int p1 = 0;
        int p2 = 1;
        for(int i=2;i<=n;i++)
        {
            int c = p1+p2;
            p1 = p2;
            p2 = c;
        }
        return p2;
        
    }
}