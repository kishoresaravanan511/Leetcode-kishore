// Last updated: 8/16/2026, 11:51:21 AM
1// class Solution {
2//     public boolean checkInclusion(String s1, String s2) {
3
4//         if(s1.length() > s2.length())   return false;
5//         int[] freq = new int[26];
6//         int k = s1.length();
7//         int n = s2.length();
8//         int[] windowFreq = new int[26];
9//         for(int i=0;i<k;i++)
10//         {
11//             freq[s1.charAt(i)-'a']++;
12//         }
13//         for(int i=0;i<k;i++)
14//         {
15//             windowFreq[s2.charAt(i)-'a']++;
16//         }
17//         if(Arrays.equals(windowFreq,freq))
18//         {
19//             return true;
20//         }
21
22//         for(int i=k;i<n;i++)
23//         {
24//             windowFreq[s2.charAt(i-k)-'a']--;
25//             windowFreq[s2.charAt(i)-'a']++;
26
27//             if(Arrays.equals(windowFreq,freq))
28//             {
29//                 return true;
30//             }
31//         }
32//         return false;
33//     }
34// }
35
36
37
38
39
40
41
42class Solution {
43    public boolean checkInclusion(String s1, String s2) {
44        if(s1.length() > s2.length())   return false;
45
46        int[] freqOfS1 = new int[26];
47        int[] freqOfS2 = new int[26];
48        int k=s1.length();
49
50        for(char c : s1.toCharArray())
51        {
52            freqOfS1[c-'a']++;
53        }
54
55        for(int i=0;i<k;i++)
56        {
57            freqOfS2[s2.charAt(i)-'a']++;
58        }
59
60        if(Arrays.equals(freqOfS1,freqOfS2))
61        {
62            return true;
63        }
64
65        for(int j=k;j<s2.length();j++)
66        {
67            freqOfS2[s2.charAt(j-k)-'a']--;
68            freqOfS2[s2.charAt(j)-'a']++;
69
70            if(Arrays.equals(freqOfS2,freqOfS1))
71            {
72                return true;
73            }
74        }
75        return false;
76    }
77}
78
79
80
81
82
83
84