// Last updated: 8/11/2026, 2:14:13 PM
class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;
        for(int i=1;i<=n*2;i++)
        {
            if(i%2==0)
            {
                sumEven++;
            }
            else
            {
                sumOdd++;
            }
        }
        return GcdOfTwoNum(Math.max(sumOdd,sumEven),Math.min(sumOdd,sumEven));
    }
    int GcdOfTwoNum(int a,int b)
    {
        while(b!=0)
        {
            int temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }
}