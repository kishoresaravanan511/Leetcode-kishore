// Last updated: 9/18/2026, 8:08:09 AM
1// class Solution {
2//     public int pivotIndex(int[] nums) {
3//         int totalSum=0;
4//         for(int x:nums)
5//             totalSum+=x;
6        
7//         int leftSum = 0;
8//         for(int i=0;i<nums.length;i++)
9//         {
10//             int rightSum = totalSum-leftSum-nums[i];
11
12//             if(leftSum==rightSum)
13//                 return i;
14
15//             leftSum+=nums[i];
16//         }
17//         return -1;
18//     }
19// }
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35class Solution {
36   public int pivotIndex(int[] nums) {
37        int n = nums.length;
38        int total = 0;
39        for(int x : nums)
40        {
41            total+=x;
42        }
43        int lSum=0;
44        int rSum = 0;
45        for(int i=0;i<n;i++)
46        {
47            rSum = total-lSum-nums[i];
48            if(lSum == rSum)
49            {
50                return i;
51            }
52            lSum+=nums[i];
53        }
54        return -1;
55    }
56}
57
58
59
60
61
62
63
64
65