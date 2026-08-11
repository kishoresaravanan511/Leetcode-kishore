// Last updated: 8/11/2026, 2:18:27 PM
class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        if(num<=1)  return false;
        for(int i=1;i<=num/2;i++)
        {
            if(num%i==0)
            {
                sum+=i;
            }
        }
        //System.out.println(sum);
        if(sum == num)
            return true;
        return false;
    }
}