// Last updated: 9/16/2026, 7:43:44 PM
1class Solution {
2    public int maxProduct(int[] nums) {
3        // int min = nums[0];
4        // int max = nums[0];
5        // int ans = nums[0];
6
7        // for(int i=1;i<nums.length;i++)
8        // {
9        //     //why we need to swap min with max and vice versa, if max = 3,min = 2,nums[i]=-1,so now max = 2,min = 3 and product -1 with max and min , we get max = -2 and min = -3,so the max is -2 ofcourse.
10        //     if(nums[i]<0)
11        //     {
12        //         int temp = max;
13        //         max = min;
14        //         min = temp;
15        //     }
16            
17        //     max = Math.max(nums[i],max*nums[i]);
18        //     min = Math.min(nums[i],min*nums[i]);
19
20        //     ans = Math.max(ans,max);
21        // }
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39        if(nums.length==1)  return nums[0];
40
41        int n = nums.length;
42        int maxLen = 0;
43        int prod = 1;
44        for(int i=0;i<n;i++)
45        {
46            prod=1;
47            for(int j=i;j<n;j++)
48            {
49               prod*=nums[j];
50               maxLen = Math.max(maxLen,prod);
51            }
52        }
53        return maxLen;
54    }
55}