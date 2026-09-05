// Last updated: 9/5/2026, 9:18:51 PM
1// class Solution {
2//     public int lengthOfLongestSubstring(String s) {
3//         int n = s.length();
4//         Set<Character> ans = new HashSet<>();
5//         int st = 0;
6//         //int end = 0;
7//         int max = 0;
8
9//         // while(end<n)
10//         // {
11//         //     char ch = s.charAt(end);
12//         //     if(!ans.contains(ch))
13//         //     {
14//         //         ans.add(ch);
15//         //         max = Math.max(end-st+1,max);
16//         //         end++;
17//         //     }
18//         //     else
19//         //     {
20//         //         ans.remove(s.charAt(st));
21//         //         st++;
22//         //     }
23//         // }
24//         // return max;
25
26//         //same same but different loops
27//         for(int end=0;end<n;end++)
28//         {
29//             while(ans.contains(s.charAt(end)))
30//             {
31//                 ans.remove(s.charAt(st));
32//                 st++;
33//             }
34//             ans.add(s.charAt(end));
35//             max = Math.max(end-st+1,max);
36//         }
37//         return max;
38//     }
39// }
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
52    public int lengthOfLongestSubstring(String s) {
53        int n = s.length();
54        int left = 0;
55        int maxLen = 0;
56        Set<Character> st = new HashSet<>();
57
58        for(int right=0;right<n;right++)
59        {
60            while(st.contains(s.charAt(right)))
61            {
62                st.remove(s.charAt(left));
63                left++;
64            }
65            st.add(s.charAt(right));
66            maxLen = Math.max(maxLen,right-left+1);
67        }
68        return maxLen;
69    }
70}
71
72
73
74
75
76
77
78