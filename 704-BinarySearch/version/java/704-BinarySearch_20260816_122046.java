// Last updated: 8/16/2026, 12:20:46 PM
1class Solution {
2    public int search(int[] nums, int target) {
3
4        
5        int low = 0;
6        int high = nums.length-1;
7        
8        while(low<=high)
9        {
10            int mid = low+(high-low)/2;
11
12            if(nums[mid] == target)
13            {
14                return mid;
15            }
16            else if(target>nums[mid])
17            {
18                low = mid+1;
19            }
20            else if(target<nums[mid])
21            {
22                high = mid-1;
23            }
24        }
25        return -1;
26    }
27}