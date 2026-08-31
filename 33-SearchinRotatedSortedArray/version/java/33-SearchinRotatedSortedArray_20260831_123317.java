// Last updated: 8/31/2026, 12:33:17 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int n = nums.length;
4        int low = 0;
5        int high = n-1;
6        
7        while(low<=high)
8        {
9            int mid = low+(high-low)/2;
10            if(nums[mid] == target)     return mid;  //check for target is in mid index,so that ,in all if statements, mid does not equals to an target is used..
11            else if(nums[low] <= nums[mid])  //then , left sorted
12            {
13                if(nums[low] <= target && target < nums[mid]) 
14                {
15                    high = mid-1;
16                }
17                else
18                {
19                    low = mid+1;
20                }
21            }
22            else  //if left is not sorted na , otherwise, right is sorted
23            {
24                if(nums[mid]<target && target <= nums[high])
25                {
26                    low = mid+1;
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