// Last updated: 8/24/2026, 9:38:25 PM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int[] result = {-1, -1};
4        int left = binarySearch(nums, target, true);
5        int right = binarySearch(nums, target, false);
6        result[0] = left;
7        result[1] = right;
8        return result;        
9    }
10
11    private int binarySearch(int[] nums, int target, boolean isSearchingLeft) {
12        int left = 0;
13        int right = nums.length - 1;
14        int idx = -1;
15
16        while (left <= right) {
17            int mid = left + (right - left) / 2;
18            
19            if (nums[mid] > target) {
20                right = mid - 1;
21            } else if (nums[mid] < target) {
22                left = mid + 1;
23            } else {
24                idx = mid;
25                if (isSearchingLeft) {
26                    right = mid - 1;
27                } else {
28                    left = mid + 1;
29                }
30            }
31        }
32
33        return idx;
34    }
35
36}