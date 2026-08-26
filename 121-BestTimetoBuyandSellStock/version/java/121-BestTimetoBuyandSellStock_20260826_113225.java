// Last updated: 8/26/2026, 11:32:25 AM
1
2// class Solution {
3//     public int singleNumber(int[] nums) {
4//         int res = 0;
5//         for (int i = 0; i < 32; i++) {
6//             int countOnes = 0;
7//             for (int j = 0; j < nums.length; j++) {
8//                 countOnes += (nums[j] >> i) & 1;
9//             }
10//             countOnes = countOnes % 3;
11//             if (countOnes != 0) {
12//                 res |= countOnes << i;
13//             }
14//         }
15//         return res;
16//     }
17// }
18
19
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
34class Solution {
35    public int singleNumber(int[] nums) {
36        Map<Integer,Integer> m = new HashMap<>();
37        for(int x : nums)
38        {
39            m.put(x,m.getOrDefault(x,0)+1);
40        }
41        for(int i=0;i<nums.length;i++)
42        {
43            if(m.get(nums[i]) == 1)
44            {
45                return nums[i];
46            }
47        }
48        return -1;
49    }
50}