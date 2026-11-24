// Last updated: 11/24/2026, 11:07:34 PM
1class Solution {
2    public int findGCD(int[] nums) {
3        int n = nums.length;
4        int min = Integer.MAX_VALUE;
5        int max = Integer.MIN_VALUE;
6        for(int i=0;i<n;i++)
7        {
8            if(nums[i]>max)
9            {
10                max = nums[i];
11            }
12            if(nums[i]<min)
13            {
14                min = nums[i];
15            }
16        }
17        return GcdOfTwoNum(max,min);
18    }
19    public int GcdOfTwoNum(int a,int b)
20    {
21        while(b!=0)
22        {
23            int temp = a%b;
24            a = b;
25            b = temp;
26        }
27        return a;
28    }
29}