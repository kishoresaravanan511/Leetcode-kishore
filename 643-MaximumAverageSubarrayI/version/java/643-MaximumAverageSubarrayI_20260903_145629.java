// Last updated: 9/3/2026, 2:56:29 PM
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int sum=0;
4        for(int i=0;i<k;i++){
5            sum+=nums[i];
6        }
7        double k1=k;
8        double avg=sum;
9        for(int i=k;i<nums.length;i++){
10            sum+=nums[i];
11            sum-=nums[i-k];
12            avg=Math.max(avg,sum);
13        }
14        avg/=k1;
15        return avg;
16    }
17}