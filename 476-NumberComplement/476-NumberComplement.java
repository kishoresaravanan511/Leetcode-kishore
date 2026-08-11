// Last updated: 8/11/2026, 2:18:38 PM
class Solution {
    public int findComplement(int num) {
        int mask=0;
        int temp = num;

        while(temp>0)
        {
            mask=mask<<1|1;
            temp>>=1;
        }
        return num^mask;
    }
}