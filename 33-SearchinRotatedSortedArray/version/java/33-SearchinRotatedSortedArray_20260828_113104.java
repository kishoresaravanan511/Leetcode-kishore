// Last updated: 8/28/2026, 11:31:04 AM
1class Solution {
2    public int search(int[] nums, int target) {
3        int n = nums.length;
4        
5        int low = 0;
6        int high = n-1;
7        while(low<=high)
8        {
9            int mid = low+(high-low)/2;
10            if(nums[mid] == target)     return mid;  //check for target is in mid index,so that , all if , mid does not an target is used..
11            if(nums[low] <= nums[mid])  //is left sorted
12            {
13                if(nums[low] <= target && target < nums[mid]) 
14                {
15                    high = mid-1;
16                }
17                else
18                {
19                    low=mid+1;
20                }
21            }
22            else  //otherwise, right is sorted
23            {
24                if(nums[mid]<target && target <= nums[high])
25                {
26                    low=mid+1;
27                }
28                else
29                {
30                    high = mid-1;
31                }
32            }
33        }
34        return -1;
35    }
36}