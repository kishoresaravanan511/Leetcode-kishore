// Last updated: 8/16/2026, 11:36:41 AM
1// // class Solution {
2// //     public int characterReplacement(String s, int k) {
3
4// //        // intuition:   first we found that totLen-maxFreq <=k   we find the valid one  , otherwise shrink the window and recompute , that's it...
5// //         int ans=0;
6// //         int left =0;
7// //         int maxFreq = 0;
8// //         int[] freq = new int[26];
9        
10// //         for(int right=0;right<s.length();right++)
11// //         {
12// //             int index = s.charAt(right)-'A';
13// //             freq[index]++;
14
15// //             maxFreq = Math.max(freq[index],maxFreq);
16// //             int windowLength = right-left+1;
17
18// //             if(windowLength-maxFreq <= k)
19// //             {
20// //                 ans = Math.max(windowLength,ans);
21// //             }
22// //             else
23// //             {
24// //                 freq[s.charAt(left)-'A']--;
25// //                 left++;
26// //                 windowLength = right-left+1; //recompute
27// //             }
28            
29// //         }
30// //         return ans;
31// //     }
32// // }
33
34
35
36
37
38
39
40
41// class Solution {
42//     public int characterReplacement(String s, int k) {
43//         int[] freq = new int[26];
44//         int n = s.length();
45//         int maxLen = 0;
46//         int i=0;
47//         int maxFreq = 0;
48
49//         for(int j=0;j<n;j++)
50//         {
51//             int ind = s.charAt(j)-'A';
52//             freq[ind]++;
53//             int windowLength = j-i+1;
54
55//             maxFreq = Math.max(maxFreq,freq[ind]);
56
57//             if(windowLength - maxFreq <= k)
58//             {
59//                 maxLen = Math.max(maxLen,windowLength);
60//             }
61//             else
62//             {
63//                 freq[s.charAt(i)-'A']--;
64//                 i++;
65//                 windowLength = j-i+1;
66//             }
67//         }
68//         return maxLen;
69//     }
70// }
71
72
73
74
75
76
77
78
79class Solution {
80    public int characterReplacement(String s, int k) {
81        int n = s.length();
82        int[] freq = new int[26];
83        int left = 0;
84        int maxLen = 0;
85        int maxFreq = 0;
86
87
88        for(int right=0;right<n;right++)
89        {
90            int index = s.charAt(right)-'A';
91            freq[index]++;
92
93            maxFreq = Math.max(maxFreq,freq[s.charAt(right)-'A']);
94            int windowLength = right-left+1;
95
96            if(windowLength-maxFreq > k)
97            {
98                freq[s.charAt(left)-'A']--;
99                left++;
100                windowLength=right-left+1;
101            }
102            maxLen = Math.max(maxLen,windowLength);
103        }
104        return maxLen;
105    }
106}
107
108
109
110
111