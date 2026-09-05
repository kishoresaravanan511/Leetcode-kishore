// Last updated: 9/5/2026, 9:14:40 PM
1class Solution {
2    public int compareVersion(String version1, String version2) {
3        String[] arr = version1.split("\\.");
4        String[] arr1 = version2.split("\\.");
5
6        int n = Math.max(arr.length,arr1.length);
7
8        for(int i=0;i<n;i++)
9        {
10            int x = (i < arr.length) ? Integer.parseInt(arr[i]) : 0;
11            int y = (i < arr1.length) ? Integer.parseInt(arr1[i]) : 0;
12
13            if(x > y)   return 1;
14            if(x < y)   return -1;
15        }
16        return 0;
17    }
18}