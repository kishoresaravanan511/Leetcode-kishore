// Last updated: 8/11/2026, 2:13:40 PM
class Solution {
    public int largestInteger(int n, int s) {
            if(s==0) return 0;
                if(s>9*n) return -1;

        StringBuilder sb = new StringBuilder();
        while(n>0)
            {
                if(s>=9)
                {
                    sb.append(9);
                    s-=9;
                }
                else
                {
                    sb.append(s);
                    s=0;
                }
                n--;
            }
        return Integer.parseInt(sb.toString());
    }
}