// Last updated: 8/29/2026, 9:24:58 PM
1class Solution {
2    public int findMin(int[] nums) {
3        int n = nums.length;
4        int low = 0;
5        int high = n-1;
6
7        while(low<high)
8        {
9            int mid = low+(high-low)/2;
10
11            if(nums[mid] > nums[high])  //therefore, mid's right contains the minimum
12            {
13                low=mid+1;  //eliminate left space
14            }
15            else
16            {
17                high=mid;  //may be the mid can be a minimum..
18            }
19        }
20        return nums[high];   //or nums[low]  because when low exceeds high it gets fails in while so return may be high or low.
21    }
22}