// Last updated: 10/11/2026, 8:48:18 AM
1class Solution {
2    public boolean threeFibonacciSum(int n) {
3    //         if(n == 2)   return true;
4    //         return isContains(n);
5    // }
6    // private boolean isContains(int n)
7    // {
8    //         if(n<2)   return false;
9    //     int[] arr = new int[n];
10    //     int first = 0;
11    //     int sec = 1;
12        
13    //     int ind = 0;
14    //     arr[ind++] = first;
15    //     arr[ind++] = sec;
16    //     for(int i=2;i<n;i++)
17    //     {
18    //         int temp = first+sec;
19    //         arr[ind++] = temp;
20    //         first = sec;
21    //         sec = temp;
22    //     }
23    //         int sum = 0;
24    //         int k = 3;
25    //         if(n < k)
26    //         {
27    //             return false;
28    //         }
29    //         for(int i=0;i<k;i++)
30    //         {
31    //             sum+=arr[i];
32    //         }
33    //         if(sum == n)
34    //             return true;
35    //     for(int i=k;i<arr.length-1;i++)
36    //     {
37    //         sum-=arr[i-k];
38    //         sum+=arr[i];
39    //         if(sum == n)
40    //         {
41    //             return true;
42    //         }
43    //     }
44    //     return false;
45
46            if(n%2 != 0)  return false;
47        int target = n/2;
48        int first = 0;
49        int sec = 1;
50        while(first < target)
51        {
52            int temp = first + sec;
53            first = sec;
54            sec = temp;
55        }
56        return first == target;
57    }
58}