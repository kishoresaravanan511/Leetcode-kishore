// Last updated: 8/31/2026, 7:40:58 PM
1// class Solution {
2//     public int[] decrypt(int[] code, int k) {
3//     int n=code.length;
4//     int[] ans = new int[n];
5//     int sum=0;
6//     int st = 0;
7//     int end = 0;
8
9//     if(k==0)
10//     {
11//         return ans;   //replaced by 0...
12//     }
13//     else if(k>0) //fixed window of size k
14//     {
15//     st = 1;
16//     end = k;
17//     for(int i=st;i<=end;i++)
18//     {
19//         sum+=code[i%n];//manual window...
20//     }   
21    
22//     for(int i=0;i<n;i++)
23//     {
24//         //circular like window wowww!!!!!!
25//         ans[i] = sum;
26//         sum -= code[st%n];
27//         st++;
28//         end++;
29//         sum += code[end%n];
30//     }
31//     }
32
33//     else if(k<0)
34//     {
35//         k=-k;  //converted to positive
36//         st = n-k; 
37//         end = n-1;
38
39//         for(int i=st;i<=end;i++)
40//         {
41//             sum+=code[i%n];   //manual window for negative case...
42//         }
43
44//         for(int i=0;i<n;i++)
45//         {
46//             ans[i] = sum;
47
48//             sum-=code[st%n];
49//             st++;
50
51//             end++;
52//             sum+=code[end%n];
53//         }
54//     }
55//     return ans;
56//     }
57// }
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
71
72
73
74
75
76
77
78class Solution {
79    public int[] decrypt(int[] code, int k) {
80        int n = code.length;
81        int[] res = new int[n];
82        int sum = 0;
83
84        if(k == 0)  return res;
85        else if(k>0)
86        {
87            int st = 1;
88            int end = k;
89
90            for(int i=st;i<=end;i++)  //manual window
91            {
92                sum += code[i%n];
93            }
94
95            for(int i=0;i<n;i++)
96            {
97                res[i] = sum;
98                sum -= code[st%n];
99                st++;
100                end++;
101                sum += code[end%n];
102            }
103        }
104        else if(k<0)
105        {
106            k = -k;  //conversion to positive
107            int st = n-k;
108            int end = n-1;
109
110            for(int i=st;i<=end;i++)
111            {
112                sum+=code[i%n];
113            }
114
115            for(int i=0;i<n;i++)
116            {
117                res[i] = sum;
118                sum -= code[st%n];
119                st++;
120                end++;
121                sum += code[end%n];
122            }
123        }
124        return res;
125    }
126}