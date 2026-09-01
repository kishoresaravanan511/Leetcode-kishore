// Last updated: 9/2/2026, 5:18:52 AM
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        int low = 0;
4        int high = nums.length - 1;
5
6        while (low < high) {
7            int mid = low + (high - low) / 2;
8
9            // if (mid % 2 == 1) {
10            //     mid--;
11            // } 
12            //for 1st half,there is matching integers in even index 
13            if ((mid%2==0 && nums[mid] == nums[mid + 1]) || (mid%2!=0 && nums[mid]==nums[mid-1])) {  //check for pair checking
14                low = mid + 1;
15            } else {
16                high = mid;
17            }
18
19        }
20        return nums[low];
21    }
22}