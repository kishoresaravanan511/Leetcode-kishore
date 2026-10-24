// Last updated: 10/24/2026, 10:22:20 PM
1class Solution {
2    public int maxVowels(String s, int k) {  //need to optimize
3    //    int n = s.length();
4    //    int c=0;
5    //    int max = 0;
6    //    String vow = "aeiouAEIOU";
7
8    //    for(int i=0;i<k;i++)
9    //    {
10    //        if(vow.indexOf(s.charAt(i)) != -1)
11    //        {
12    //             c++;
13    //        }
14    //    } 
15    //    max = c;
16
17    //    int st = 0;
18    //    int end = k;
19
20    //    while(end<n)
21    //    {
22    //         if(vow.indexOf(s.charAt(st)) != -1)
23    //         {
24    //             c--;
25    //         }
26    //         st++;
27    //         if(vow.indexOf(s.charAt(end)) != -1)
28    //         {
29    //             c++;
30    //         }
31    //         end++;
32
33    //         max = Math.max(c,max);
34    //    }
35    //    return max;
36
37    int n = s.length();
38    int maxLen = 0;
39    int c=0;
40    for(int i=0;i<k;i++)
41    {
42        if(isVowel(s.charAt(i)))
43            c++;
44    }
45    maxLen = c;
46
47    for(int i=k;i<n;i++)
48    {
49        if(isVowel(s.charAt(i-k)))
50        {
51            c--;  //for avoiding first counted value  , example case:1
52        }
53        if(isVowel(s.charAt(i)))
54        {
55            c++;
56        }
57        maxLen = Math.max(c,maxLen);
58    }
59    return maxLen;
60    }
61    
62    boolean isVowel(char c)
63    {
64        switch(c)
65        {
66            case 'a':
67            case 'e':
68            case 'i':
69            case 'o':
70            case 'u':
71                return true;
72        }
73        return false;
74        
75    }
76}