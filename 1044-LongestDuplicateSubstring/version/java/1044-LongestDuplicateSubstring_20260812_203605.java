// Last updated: 8/12/2026, 8:36:05 PM
1// class Solution {
2//     public int missingInteger(int[] nums) {
3//         Set<Integer> s = new HashSet<>();   //for checking duplication.
4//         int prefix = nums[0];  //initial prefix..
5
6//         for(int i=1;i<nums.length;i++)
7//         {
8//             if(nums[i] == nums[i-1]+1)  //it is only a sequence..
9//             {
10//                 prefix+=nums[i];
11//             }
12//             else
13//             {
14//                 break;
15//             }
16//         }
17//         for(int x : nums)  //for checking the prefix already exist in set.
18//         {
19//             s.add(x);
20//         }
21//         while(s.contains(prefix))   //see case 2 , there is 12, 13 , 14 and then 15 is prsent in set so,o/p is 15.
22//         {
23//             prefix++;
24//         }
25//         return prefix;
26//     }
27// }
28
29
30
31
32
33// class Solution {
34//     public int missingInteger(int[] nums) {
35//         int prefix = nums[0];
36//         int n = nums.length;
37//         Set<Integer> s = new HashSet<>();
38
39//         for(int i=1;i<n;i++)
40//         {
41//             if(nums[i] == nums[i-1]+1)
42//             {
43//                 prefix+=nums[i];
44//             }
45//             else
46//             {
47//                 break;
48//             }
49//         }
50//         for(int x : nums)
51//         {
52//             s.add(x);
53//         }
54//         while(s.contains(prefix))
55//         {
56//             prefix++;
57//         }
58//         return prefix;
59
60//     }
61// }
62
63
64
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
76
77
78
79class Solution {
80    public int missingInteger(int[] nums) {
81        int n = nums.length;
82        int prefix = nums[0];
83        Set<Integer> s = new HashSet<>();
84
85        for(int i=1;i<n;i++)
86        {
87            if(nums[i] == nums[i-1]+1)
88            {
89                prefix+=nums[i];
90            }
91            else
92            {
93                break;
94            }
95        }
96        for(int q : nums)
97        {
98            s.add(q);
99        }
100
101        while(s.contains(prefix))
102        {
103            prefix++;
104        }
105        return prefix;
106    }
107}
108
109
110
111
112
113
114
115
116
117
118
119
120
121
122
123
124
125
126
127
128
129
130
131
132