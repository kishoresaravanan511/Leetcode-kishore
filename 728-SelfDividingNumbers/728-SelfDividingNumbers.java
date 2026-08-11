// Last updated: 8/11/2026, 2:17:48 PM
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l = new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(selfDivide(i))
            {
                l.add(i);
            }
        }
        return l;
    }
    boolean selfDivide(int n)
    {
        int original=n;
        while(n!=0)
        {
            int d=n%10;
            if(d==0 || original%d!=0)
                return false;
            n/=10;
        }
        return true;
    }
}