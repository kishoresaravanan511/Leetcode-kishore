// Last updated: 11/12/2026, 8:56:38 PM
1class Solution {
2    public boolean checkIfExist(int[] arr) {
3        int n = arr.length;
4        for(int i=0;i<n;i++)
5        {
6            for(int j=0;j<n;j++)
7            {
8                if(i!=j && arr[i] == arr[j] * 2)
9                {
10                    return true;
11                }
12            }
13        }
14        return false;
15    }
16}