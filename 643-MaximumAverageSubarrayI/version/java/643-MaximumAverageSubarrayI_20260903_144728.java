// Last updated: 9/3/2026, 2:47:28 PM
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int sum=0;
4        int max=0;
5        for(int i=0;i<k;i++){
6           sum+=nums[i];
7        }
8        int avg=sum;
9        for(int i=k;i<nums.length;i++){
10            sum-=nums[i-k];
11            sum+=nums[i];   
12            avg=Math.max(avg,sum);
13        }
14        return (double) avg/k;
15    }
16}