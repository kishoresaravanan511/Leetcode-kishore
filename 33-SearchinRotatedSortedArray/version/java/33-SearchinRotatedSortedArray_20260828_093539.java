// Last updated: 8/28/2026, 9:35:39 AM
1class Solution {
2    public int search(int[] nums, int target) {
3        int n = nums.length;
4        // int ans = -1;
5
6        // for(int i=0;i<n;i++)
7        // {
8        //     if(nums[i] == target)
9        //     {
10        //         ans = i;
11        //     }
12        // }
13        // return ans;
14
15
16
17        int low = 0;
18        int high = n-1;
19        while(low<=high)
20        {
21            int mid = low+(high-low)/2;
22            if(nums[mid] == target)     return mid;
23            if(nums[low] <= nums[mid])  //is left sorted
24            {
25                if(nums[low] <= target && target < nums[mid])
26                {
27                    high = mid-1;
28                }
29                else
30                {
31                    low=mid+1;
32                }
33            }
34            else  //otherwise, right is sorted
35            {
36                if(nums[mid] < target && target <= nums[high])
37                {
38                    low=mid+1;
39                }
40                else
41                {
42                    high = mid-1;
43                }
44            }
45        }
46        return -1;
47    }
48}