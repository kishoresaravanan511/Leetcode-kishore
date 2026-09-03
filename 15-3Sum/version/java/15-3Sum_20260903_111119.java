// Last updated: 9/3/2026, 11:11:19 AM
1// class Solution {
2//     public List<List<Integer>> threeSum(int[] nums) {
3//         Arrays.sort(nums);
4//         int n = nums.length;
5//         Set<List<Integer>> s = new HashSet<>();
6//         for(int i=0;i<n;i++)
7//         {
8//             for(int j=i+1;j<n;j++)
9//             {
10//                 for(int k=j+1;k<n;k++)
11//                 {
12//                     if(nums[i]+nums[j]+nums[k] == 0)
13//                     {
14//                         s.add(Arrays.asList(nums[i],nums[j],nums[k]));
15//                     }
16//                 }
17//             }
18//         }
19//         return new ArrayList<>(s);
20
21//     }
22// }
23
24
25
26// import java.util.*;
27
28// public class Solution {
29//     public List<List<Integer>> threeSum(int[] nums) {
30//         List<List<Integer>> ans = new ArrayList<>();
31//         Arrays.sort(nums); // Sorting is crucial for the two-pointer approach
32//         int n = nums.length;
33
34//         for (int i = 0; i < n - 2; i++) {
35//             // Optimization: If the current starting number is greater than 0, 
36//             // no three numbers after it can ever sum up to 0. Break early.
37//             if (nums[i] > 0) break;
38
39//             // Skip duplicate values for the first element to avoid duplicate triplets
40//             if (i > 0 && nums[i] == nums[i - 1]) continue;
41
42//             int left = i + 1;
43//             int right = n - 1;
44
45//             while (left < right) {
46//                 int sum = nums[i] + nums[left] + nums[right];
47
48//                 if (sum == 0) {
49//                     ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
50
51//                     // Skip duplicate values for the left pointer
52//                     while (left < right && nums[left] == nums[left + 1]) left++;
53//                     // Skip duplicate values for the right pointer
54//                     while (left < right && nums[right] == nums[right - 1]) right--;
55
56//                     // Move both pointers inward
57//                     left++;
58//                     right--;
59//                 } else if (sum < 0) {
60//                     // The sum is too small; make it larger by moving the left pointer up
61//                     left++;
62//                 } else {
63//                     // The sum is too big; make it smaller by moving the right pointer down
64//                     right--;
65//                 }
66//             }
67//         }
68
69//         return ans;
70//     }
71// }
72
73public class Solution {
74    public List<List<Integer>> threeSum(int[] nums) {
75        Set<List<Integer>> s = new HashSet<>();
76        int n = nums.length;
77        Arrays.sort(nums);
78
79        for(int i=0;i<n;i++)
80        {
81            int j = i+1;
82            int k = n-1;
83            while(j<k)
84            {
85                if(i!=j && i!=k && j!=k)
86                {
87                    if(nums[i]+nums[j]+nums[k]==0)
88                    {
89                        s.add(Arrays.asList(nums[i],nums[j],nums[k]));
90                        j++;
91                    }
92                    else if(nums[i]+nums[j]+nums[k]<0)
93                    {
94                        j++;
95                    }
96                    else
97                    {
98                        k--;
99                    }
100                }
101            }
102        }
103        return new ArrayList<>(s);
104        }
105}