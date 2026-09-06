// Last updated: 9/6/2026, 9:22:10 AM
1class Solution {
2    public int countGoodRotations(int[] nums) {
3        int n = nums.length;
4        int k = n/2;
5        long total = 0;
6        long windowSum=0;
7        int c=0;
8
9        for(int x:nums){
10            total+=x;
11        }
12        //double need = (double)total/2;
13
14        for(int i=0;i<k;i++)
15        {
16            windowSum+=nums[i];
17        }
18        for(int i=k;i<n+k;i++)
19        {
20            if(windowSum*2 > total)
21            {
22                c++;
23            }
24            windowSum-=nums[i-k];
25            windowSum+=nums[i%n];   
26        }
27        return c;
28    }
29}