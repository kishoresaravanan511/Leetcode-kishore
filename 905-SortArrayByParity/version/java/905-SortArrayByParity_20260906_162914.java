// Last updated: 9/6/2026, 4:29:14 PM
1class Solution {
2    public int[] sortArrayByParity(int[] nums) {
3        int n = nums.length;
4        int ind = 0;
5        int left = 0;
6        int right = 0;
7
8        while(right < n)
9        {
10            if(nums[right] % 2 == 0)
11            {
12                int temp = nums[left];
13                nums[left] = nums[right];
14                nums[right] = temp;
15                left++;
16            }
17            right++;
18        }
19        // while(ind < n)
20        // {
21        //     nums[ind] = nums[right];
22        // }
23        return nums;
24    }
25}