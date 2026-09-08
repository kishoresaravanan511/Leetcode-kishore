// Last updated: 9/8/2026, 10:36:13 AM
1class Solution {
2    public void rotate(int[] nums, int k) {
3        int n = nums.length;
4        k = k % n;  //for k larger than n
5        reverse(nums, 0, n - 1);
6        reverse(nums, 0, k - 1);
7        reverse(nums, k, n - 1);
8    }
9    void reverse(int[] nums, int s, int e) {
10        while(s < e) {
11            int temp = nums[s];
12            nums[s] = nums[e];
13            nums[e] = temp;
14            s++;
15            e--;
16        }
17    }
18}