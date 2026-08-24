// Last updated: 8/24/2026, 9:46:37 PM
1// class Solution {
2//     public int longestOnes(int[] nums, int k) {
3//         int zeroCount = 0;
4//         int i=0;
5//         int maxLen = 0;
6
7//         for(int j=0;j<nums.length;j++)
8//         {
9//             if(nums[j]==0)
10//             {
11//                 zeroCount++;
12//             }
13//             //edge case , if suppose we shrink the window, then the first element is 0 means zeroCount--,expand i..
14//             while(zeroCount>k)
15//             {
16//                 if(nums[i] == 0)
17//                 {
18//                     zeroCount--;
19//                 }
20//                 i++;
21//             }
22//             int windowLength=j-i+1;
23//             maxLen = Math.max(windowLength,maxLen);
24//         }
25//         return maxLen;
26//     }
27// }
28
29
30
31
32
33
34
35
36
37
38
39class Solution {
40    public int longestOnes(int[] nums, int k) {
41        int left = 0;
42        int maxLen = 0;
43        int n=nums.length;
44        int zeroCount = 0;
45
46        for(int right = 0;right<n;right++)
47        {
48            if(nums[right]==0)
49            {
50                zeroCount++;
51            }
52            while(zeroCount > k)
53            {
54                if(nums[left] == 0)  //edge case for zero
55                {
56                    zeroCount--;
57                }
58                left++;
59            }
60            maxLen = Math.max(right-left+1,maxLen);
61        }
62        return maxLen;
63    }
64}
65
66
67
68
69
70
71
72
73
74
75