// Last updated: 9/22/2026, 9:55:53 PM
1class Solution {
2    public int largestAltitude(int[] gain) {
3        int n = gain.length;
4        int high = 0;
5        int sum=0;
6        // int[] prefix = new int[n+1];
7        // prefix[0] = 0;
8
9        // for(int i=0;i<n;i++)
10        // {
11        //     prefix[i+1] = prefix[i] + gain[i];
12        // }
13        // for(int x : prefix)
14        // {
15        //     high = Math.max(high,x);
16        // }
17
18        //another
19        for(int x : gain)
20        {
21            sum+=x;
22            high = Math.max(high,sum);
23        }
24        //System.out.println(Arrays.toString(prefix));
25        return high;
26    }
27}