// Last updated: 8/11/2026, 2:15:25 PM
class Solution {
    public int totalMoney(int n) {
        int sum =0;
        int counter =0;
        int i=0;
        
        while(i<n)
        {
            for(int j=1;j<=7 && i<n;j++,i++)
            {
                sum += (counter + j);
            }
            counter++;
        }
        return sum;
        
    }
}