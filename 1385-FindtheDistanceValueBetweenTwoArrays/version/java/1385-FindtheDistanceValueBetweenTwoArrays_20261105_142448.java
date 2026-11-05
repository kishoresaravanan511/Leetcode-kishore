// Last updated: 11/5/2026, 2:24:48 PM
1class Solution {
2    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
3        int n = arr2.length;
4        int res = 0;
5        int count = 0;
6        for(int i=0;i<arr1.length;i++)
7        {
8            boolean valid = true;
9            for(int j=0;j<n;j++)
10            {
11                res = Math.abs(arr1[i] - arr2[j]);
12                if(res <= d)
13                {
14                    valid = false;
15                    break;
16                }
17            }
18            if(valid==true)
19            {
20                count++;
21            }
22
23        }
24        return count;
25    }
26}