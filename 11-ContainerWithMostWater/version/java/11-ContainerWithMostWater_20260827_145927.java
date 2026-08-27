// Last updated: 8/27/2026, 2:59:27 PM
1// class Solution {
2//     public int maxArea(int[] height) {
3//         int left = 0;
4//         int right = height.length-1;
5//         int maxx = Integer.MIN_VALUE;
6
7//         while(left<right)
8//         {
9//         int width = right - left;   //8   //7
10
11//         int hght = Math.min(height[left],height[right]);   //1   //7
12        
13//         maxx=Math.max(maxx,width*hght);   //8   //49
14
15//             if(height[left]<=height[right])   //1
16//                 left++;
17//             else
18//                 right--;
19//         }
20//         return maxx;
21
22//     }
23// }
24
25
26
27
28
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
45
46class Solution {
47    public int maxArea(int[] height) {
48        int n = height.length;
49        int left = 0;
50        int right = n-1;
51        int max = Integer.MIN_VALUE;
52
53        while(left<right)
54        {
55            int hgt = Math.min(height[left],height[right]);
56            int width = right - left;
57
58            max = Math.max(max,hgt*width);
59
60            if(height[left] <= hgt)
61            {
62                left++;
63            }
64            else
65            {
66                right--;
67            }
68        }
69        return max;
70    }
71}