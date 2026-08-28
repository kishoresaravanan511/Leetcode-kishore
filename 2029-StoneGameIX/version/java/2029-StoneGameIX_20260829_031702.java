// Last updated: 8/29/2026, 3:17:02 AM
1class Solution {
2    public int largestAltitude(int[] gain) {
3        int n = gain.length;
4        int[] ans = new int[n+1];
5        //ans[0] = 0;
6        
7
8        for(int i=1;i<=n;i++)
9        {
10            ans[i] = gain[i-1]+ans[i-1];
11        }
12        Arrays.sort(ans);
13        System.out.print(Arrays.toString(ans));
14        return ans[n];
15    }
16}