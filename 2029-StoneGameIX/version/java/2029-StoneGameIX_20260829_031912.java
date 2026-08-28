// Last updated: 8/29/2026, 3:19:12 AM
1class Solution {
2    public int largestAltitude(int[] gain) {
3        int n = gain.length;
4        int[] ans = new int[n+1];
5        //ans[0] = 0;
6        
7
8        for(int i=1;i<ans.length;i++)
9        {
10            ans[i] = gain[i-1]+ans[i-1];
11        }
12        //Arrays.sort(ans);
13        int max = Integer.MIN_VALUE;
14        for(int x : ans)
15        {
16            if(x>max)
17            {
18                max = x;
19            }
20        }
21        System.out.print(Arrays.toString(ans));
22        return max;
23    }
24}