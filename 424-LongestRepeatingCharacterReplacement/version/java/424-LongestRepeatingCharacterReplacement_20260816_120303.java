// Last updated: 8/16/2026, 12:03:03 PM
1// class Solution {
2//     public boolean isPalindrome(String s) {
3//         if(s.isEmpty())     return true;
4
5//         int p1 = 0;
6//         int p2 = s.length()-1;
7
8//         while(p1<=p2)
9//         {
10//             int currFirst = s.charAt(p1);
11//             int currLast = s.charAt(p2);
12
13//             if(!Character.isLetterOrDigit(currFirst))
14//                     p1++;
15//             else if(!Character.isLetterOrDigit(currLast))
16//                     p2--;
17//             else
18//             {
19//                 if(Character.toLowerCase(currFirst) != Character.toLowerCase(currLast))
20//                     return false;
21//                 p1++;
22//                 p2--;
23//             }
24//         }
25//         return true;
26        
27//     }
28// }
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45class Solution {
46    public boolean isPalindrome(String s) {
47        if(s == " ")    return true;
48
49        String cleaned = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
50        int n=cleaned.length();
51        int p1=0;
52        int p2=n-1;
53
54        while(p1<=p2)
55        {
56            if(cleaned.charAt(p1) != cleaned.charAt(p2))
57            {
58                return false;
59            }
60            else
61            {
62                p1++;
63                p2--;
64            }
65        }
66        return true;
67    }
68}