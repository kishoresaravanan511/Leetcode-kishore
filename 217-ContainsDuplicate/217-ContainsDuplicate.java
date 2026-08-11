// Last updated: 8/11/2026, 2:20:57 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        // int i,j,count=0;
        // int n = nums.length;
        // for(i=0;i<n;i++)
        // {
        //     for(j=i+1;j<n;j++)
        //     {
        //         if(nums[i]==nums[j])
        //         {
        //             count++;
        //         }
        //     }
        // }
        // if(count>0)
        //         return true;
        // else
        //         return false;


        // int[] freq = new int [nums.length];
        // for(int i=0;i<nums.length;i++)
        // {
        //     freq[i]++;
        // }
        // for(int j=0;j<freq.length;j++)
        // {
        //     if(freq[j] > 1) return false;
        // }
        // return true;

        Set<Integer> s = new HashSet<>();
        for(int x:nums)
        {
            if(!s.add(x))   return true;
        }
        return false;
    }
}