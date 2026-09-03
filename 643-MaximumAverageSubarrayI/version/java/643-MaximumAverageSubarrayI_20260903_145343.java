// Last updated: 9/3/2026, 2:53:43 PM
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int sum=0;
4        for(int i=0;i<k;i++){
5            sum+=nums[i];
6        }
7        int avg=sum;
8        for(int i=k;i<nums.length;i++){
9            sum+=nums[i];
10            sum-=nums[i-k];
11            avg=Math.max(avg,sum);
12        }
13        return (double)avg/k;
14    }
15}