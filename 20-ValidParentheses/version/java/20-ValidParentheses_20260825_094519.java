// Last updated: 8/25/2026, 9:45:19 AM
1// class Solution {
2//     public int[] searchRange(int[] nums, int target) {
3//         int[] result = {-1, -1};
4//         int left = binarySearch(nums, target, true);
5//         int right = binarySearch(nums, target, false);
6//         result[0] = left;
7//         result[1] = right;
8//         return result;        
9//     }
10
11//     private int binarySearch(int[] nums, int target, boolean isSearchingLeft) {
12//         int left = 0;
13//         int right = nums.length - 1;
14//         int idx = -1;
15
16//         while (left <= right) {
17//             int mid = left + (right - left) / 2;
18            
19//             if (nums[mid] > target) {
20//                 right = mid - 1;
21//             } else if (nums[mid] < target) {
22//                 left = mid + 1;
23//             } else {
24//                 idx = mid;
25//                 if (isSearchingLeft) {
26//                     right = mid - 1;
27//                 } else {
28//                     left = mid + 1;
29//                 }
30//             }
31//         }
32
33//         return idx;
34//     }
35
36// }
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51class Solution {
52    public int[] searchRange(int[] nums, int target) {
53        int n = nums.length;
54        int first = lowerBound(nums,0,n-1,target);
55        if(first == n || nums[first] != target)
56        {
57            return new int[]{-1,-1};
58        }
59        return new int[]{first,upperBound(nums,0,n-1,target)-1};
60    }
61    int lowerBound(int[] arr, int low,int high,int target)
62    {
63        int ans = arr.length;
64        while(low<=high)
65        {
66            int mid = low+(high-low)/2;
67            if(arr[mid] >= target)
68            {
69                ans = mid;
70                high=mid-1;
71            }
72            else
73            {
74                low=mid+1;
75            }
76        }
77        return ans;
78    }
79    int upperBound(int[] arr,int low,int high,int target)
80    {
81        int ans = arr.length;
82        while(low<=high)
83        {
84            int mid = low+(high-low)/2;
85            if(arr[mid] > target)
86            {
87                ans = mid;
88                high = mid-1;
89            }
90            else
91            {
92                low=mid+1;
93            }
94        }
95        return ans;
96    }
97}
98