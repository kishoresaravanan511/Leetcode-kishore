// Last updated: 10/25/2026, 7:19:18 PM
1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int n = nums.length;
4        int ans = n;
5
6        int low=0;
7        int high=n-1;
8
9        while(low<=high)
10        {
11            int mid = low+(high-low)/2;
12
13            if(nums[mid] >= target)   //lower bound
14            {
15                ans = mid;
16                high=mid-1;
17            }
18            else
19            {
20                low=mid+1;
21            }
22        }
23        return ans;
24    }
25}