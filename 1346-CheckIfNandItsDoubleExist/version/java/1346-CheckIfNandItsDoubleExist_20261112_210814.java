// Last updated: 11/12/2026, 9:08:14 PM
1class Solution {
2    public boolean checkIfExist(int[] arr) {
3        int n = arr.length;
4        // for(int i=0;i<n;i++)
5        // {
6        //     for(int j=0;j<n;j++)
7        //     {
8        //         if(i!=j && arr[i] == arr[j] * 2)
9        //         {
10        //             return true;
11        //         }
12        //     }
13        // }
14        // return false;
15        
16        for(int i=0;i<n;i++)
17        {
18            int x = arr[i];
19            boolean ans = isItFound(i,x*2,arr);
20            if(ans)
21            {
22                return true;
23            }
24        }
25        return false;
26    }
27    private boolean isItFound(int ind,int k,int[] nums)
28    {
29        for(int i=0;i<nums.length;i++)
30        {
31            if(ind != i && nums[i] == k)
32            {
33                return true;
34            }
35        }
36        return false;
37    }
38}