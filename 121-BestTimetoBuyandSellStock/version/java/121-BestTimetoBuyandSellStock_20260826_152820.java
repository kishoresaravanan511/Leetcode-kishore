// Last updated: 8/26/2026, 3:28:20 PM
1class Solution {
2    public void moveZeroes(int[] nums) {
3    //    int p1 = 0;
4    //    for(int p2 = 0;p2<nums.length;p2++)
5    //    {
6    //         if(nums[p2]!=0)
7    //         {
8    //             int temp = nums[p1];
9    //             nums[p1] = nums[p2];
10    //             nums[p2] = temp;
11    //             p1++;
12    //         }
13    //    } 
14       int ind = 0;
15       for(int x : nums)
16       {
17            if(x!=0)
18            {
19                nums[ind++] = x;
20            }
21       }
22       while(ind<nums.length)
23       {
24            nums[ind++] = 0;
25       }
26    }
27}