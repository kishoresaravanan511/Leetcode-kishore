// Last updated: 8/25/2026, 10:53:29 AM
1// class Solution {
2//     public int[] searchRange(int[] nums, int target) {
3//         int n = nums.length;
4//         int first = lowerBound(nums,0,n-1,target);
5//         if(first == n || nums[first] != target)
6//         {
7//             return new int[]{-1,-1};
8//         }
9//         return new int[]{first,upperBound(nums,0,n-1,target)-1};
10//     }
11//     int lowerBound(int[] arr, int low,int high,int target)
12//     {
13//         int ans = arr.length;
14//         while(low<=high)
15//         {
16//             int mid = low+(high-low)/2;
17//             if(arr[mid] >= target)
18//             {
19//                 ans = mid;
20//                 high=mid-1;
21//             }
22//             else
23//             {
24//                 low=mid+1;
25//             }
26//         }
27//         return ans;
28//     }
29//     int upperBound(int[] arr,int low,int high,int target)
30//     {
31//         int ans = arr.length;
32//         while(low<=high)
33//         {
34//             int mid = low+(high-low)/2;
35//             if(arr[mid] > target)
36//             {
37//                 ans = mid;
38//                 high = mid-1;
39//             }
40//             else
41//             {
42//                 low=mid+1;
43//             }
44//         }
45//         return ans;
46//     }
47// }
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63class Solution {
64    public int[] searchRange(int[] nums, int target) {
65        int start = firstOccurence(nums,0,nums.length-1,target);
66        if(start == -1)     return new int[]{-1,-1};
67        return new int[]{start,lastOccurence(nums,0,nums.length-1,target)};
68    }
69    int firstOccurence(int[] arr,int low,int high,int target)
70    {
71        int first = -1;
72
73        while(low<=high)
74        {
75            int mid = low+(high-low)/2;
76
77            if(arr[mid] == target)
78            {
79                first = mid;
80                high=mid-1;
81            }
82            else if(arr[mid]<target)
83            {
84                low=mid+1;
85            }
86            else
87            {
88                high=mid-1;
89            }
90        }
91        return first;
92    }
93    int lastOccurence(int[] arr,int low,int high,int target)
94    {
95        int last = -1;
96        while(low<=high)
97        {
98            int mid = low+(high-low)/2;
99            if(arr[mid]==target)
100            {
101                last = mid;
102                low=mid+1;
103            }
104            else if(arr[mid]<target)
105            {
106                low=mid+1;
107            }
108            else
109            {
110                high = mid-1;
111            }
112        }
113        return last;
114    }
115}