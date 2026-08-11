// Last updated: 8/11/2026, 2:15:59 PM
class Solution {
    public int maxPower(String s) {
        int n = s.length();


        if(s.length() == 1) return 1;
        if(s.length() == 0) return 0;
        int max = 0;
        int count = 1;
        for(int i=1;i<n;i++)
        {
            char ch = s.charAt(i);
            char ch1 = s.charAt(i-1);

            if(ch == ch1)
            {
                count++;
            }
            else
            {
                count=1;
            }
            if(count>max)
            {
                max = count;
            }
        }
        return max;
    }
}