// Last updated: 8/11/2026, 2:20:28 PM
class Solution {
    public int addDigits(int num) {
       int d;
       int res=0;

       while(num>=10)
       {
            res=0;

        while(num!=0)
       {
            d=num%10;
            res+=d;
            num/=10;
       } 
            num=res;
       }
            return num;
        
    }
}