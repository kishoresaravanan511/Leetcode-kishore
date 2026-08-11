// Last updated: 8/11/2026, 8:33:44 PM
1// class Solution {
2//     public int findLHS(int[] nums) {
3//        // Arrays.sort(nums);   //we do not fix all elements must be in 1 diff so we sort it
4//         int i=0;    
5//         int max = 0;
6
7//         for(int j=0;j<nums.length;j++)
8//         {
9//             while(nums[j]-nums[i] > 1)
10//             {
11//                 i++;
12//             }
13//             if(nums[j] - nums[i] == 1)
14//             {
15//                 max = Math.max(max,j-i+1);
16//             }
17//         }
18//         return max;
19//     } 
20// }
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
35
36class Solution {
37    public int findLHS(int[] nums) {
38        Arrays.sort(nums);
39
40        int i=0;
41        int max = 0;
42
43        for(int j=0;j<nums.length;j++)
44        {
45            while(nums[j]-nums[i] > 1)  //while becozz, check iterativelyyyy
46            {
47                i++;
48            }
49            if (nums[j] - nums[i] == 1)
50            {
51                max = Math.max(max,j-i+1);
52            }
53        }
54        return max;
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
66
67
68
69
70