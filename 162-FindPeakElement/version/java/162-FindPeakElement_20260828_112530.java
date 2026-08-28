// Last updated: 8/28/2026, 11:25:30 AM
1class Solution {
2    public int findPeakElement(int[] nums) {
3       int n = nums.length;
4
5       int low = 0;
6       int high = n-1;
7
8       while(low<high)
9       {
10            int mid = low+(high-low)/2;
11            if(nums[mid] < nums[mid+1])
12            {
13                low=mid+1;
14            }
15            else
16            {
17                high = mid;
18            }
19       }
20       return high; 
21    }
22}