// Last updated: 8/11/2026, 2:17:30 PM
class Solution {
    public int search(int[] nums, int target) {
        int low=0,high=nums.length-1,flag=0,mid=0;

        while(low<=high)
        {
            mid = (low+high)/2;
            if(nums[mid]==target)
            {
                flag=1;
                return mid;
            }
            else if(nums[mid]<target)
                low=mid+1;
            else
                high = mid-1;
        }
        if(flag==1)
            return mid;
        else
            return -1;

    }
}