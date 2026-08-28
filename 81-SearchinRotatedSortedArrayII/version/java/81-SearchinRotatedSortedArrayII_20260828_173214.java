// Last updated: 8/28/2026, 5:32:14 PM
1class Solution {
2    public boolean search(int[] nums, int target) {
3        int n = nums.length;
4        int low = 0 , high = n-1;
5
6        while(low <= high){
7            int mid = (low + high )/2;
8            if(nums[mid] == target) 
9                return true;
10            if(nums[low] == nums[mid] && nums[mid] == nums[high]){
11                low++;
12                high--;
13                continue;
14            }
15            if(nums[low] <= nums[mid]){
16                if(target >= nums[low] && target <= nums[mid]){
17                    high = mid -1;
18                }else{
19                    low = mid + 1;
20                }
21            }
22            else {
23                if(target > nums[mid] && target <= nums[high]){
24                    low = mid +1 ;
25                }else{
26                    high = mid - 1;
27                }
28            }
29        }
30        return false;
31    }
32}