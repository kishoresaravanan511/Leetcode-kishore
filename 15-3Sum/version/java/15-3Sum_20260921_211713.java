// Last updated: 9/21/2026, 9:17:13 PM
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
20//     }
21// }
22
23
24
25// import java.util.*;
26
27// public class Solution {
28//     public List<List<Integer>> threeSum(int[] nums) {
29//         List<List<Integer>> ans = new ArrayList<>();
30//         Arrays.sort(nums); // Sorting is crucial for the two-pointer approach
31//         int n = nums.length;
32
33//         for (int i = 0; i < n - 2; i++) {
34//             // Optimization: If the current starting number is greater than 0, 
35//             // no three numbers after it can ever sum up to 0. Break early.
36//             if (nums[i] > 0) break;
37
38//             // Skip duplicate values for the first element to avoid duplicate triplets
39//             if (i > 0 && nums[i] == nums[i - 1]) continue;
40
41//             int left = i + 1;
42//             int right = n - 1;
43
44//             while (left < right) {
45//                 int sum = nums[i] + nums[left] + nums[right];
46
47//                 if (sum == 0) {
48//                     ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
49
50//                     // Skip duplicate values for the left pointer
51//                     while (left < right && nums[left] == nums[left + 1]) left++;
52//                     // Skip duplicate values for the right pointer
53//                     while (left < right && nums[right] == nums[right - 1]) right--;
54
55//                     // Move both pointers inward
56//                     left++;
57//                     right--;
58//                 } else if (sum < 0) {
59//                     // The sum is too small; make it larger by moving the left pointer up
60//                     left++;
61//                 } else {
62//                     // The sum is too big; make it smaller by moving the right pointer down
63//                     right--;
64//                 }
65//             }
66//         }
67
68//         return ans;
69//     }
70// }
71
72public class Solution {
73    public List<List<Integer>> threeSum(int[] nums) {
74        Set<List<Integer>> s = new HashSet<>();
75        int n = nums.length;
76        Arrays.sort(nums);
77
78        for(int i=0;i<n;i++)
79        {
80            int j = i+1;
81            int k = n-1;
82            while(j<k)
83            {
84                if(i!=j && i!=k && j!=k)
85                {
86                    if(nums[i]+nums[j]+nums[k]==0)
87                    {
88                        s.add(Arrays.asList(nums[i],nums[j],nums[k]));
89                        j++;
90                    }
91                    else if(nums[i]+nums[j]+nums[k]<0)
92                    {
93                        j++;
94                    }
95                    else
96                    {
97                        k--;
98                    }
99                }
100            }
101        }
102        return new ArrayList<>(s);
103        }
104}