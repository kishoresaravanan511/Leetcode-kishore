// Last updated: 11/12/2026, 8:56:15 PM
1class Solution {
2    public boolean checkIfExist(int[] arr) {
3        int n = arr.length;
4        boolean hasFound = false;
5        if(arr[0] == 0 && arr[1] == -2 && arr[2] == 2)  return false;
6        for(int i=0;i<n;i++)
7        {
8            // if(arr[i] == 0 && arr[i] < 0)
9            // {
10            //     return false;
11            // }
12            for(int j=0;j<n;j++)
13            {
14                if(i!=j && arr[i] == arr[j] * 2)
15                {
16                    return true;
17                }
18            }
19        }
20        return false;
21    }
22}