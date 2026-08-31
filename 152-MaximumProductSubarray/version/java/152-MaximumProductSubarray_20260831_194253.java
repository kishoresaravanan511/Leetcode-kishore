// Last updated: 8/31/2026, 7:42:53 PM
1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3        if(k<=1)    return 0;   //edge case.
4        int n = nums.length;
5        int prod = 1;
6        int c=0;
7        int i=0;
8        int j=0;
9        //sliding window variable length
10        while(j<n)
11        {
12            prod*=nums[j];
13
14            while(prod>=k)
15            {
16                prod/=nums[i];  //previous delete
17                i++;  //forward
18            }
19            c+=(j-i+1);   //lengths..
20            j++;  //extending
21        }
22        return c;
23    }
24}