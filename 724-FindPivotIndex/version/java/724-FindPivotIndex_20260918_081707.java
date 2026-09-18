// Last updated: 9/18/2026, 8:17:07 AM
1class Solution {
2    public int largestAltitude(int[] gain) {
3        int n = gain.length;
4        int high = 0;
5        int[] prefix = new int[n+1];
6        prefix[0] = 0;
7
8        for(int i=0;i<n;i++)
9        {
10            prefix[i+1] = prefix[i] + gain[i];
11            // high = Math.max(high,prefix[i]);
12        }
13        for(int x : prefix)
14        {
15            high = Math.max(high,x);
16        }
17        System.out.println(Arrays.toString(prefix));
18        return high;
19    }
20}