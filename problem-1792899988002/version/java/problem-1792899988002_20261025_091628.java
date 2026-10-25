// Last updated: 10/25/2026, 9:16:28 AM
1// class Solution {
2//     public long maximizeSum(int[] nums, int k) {
3//         int n = nums.length;
4//         List<Integer> l = new ArrayList<>();
5//         long sum = 0;
6//         // for(int x : nums)
7//         //     {
8//         //         l.add(x);    
9//         //     }
10//         int[] reversed = new int[k];
11//         Arrays.sort(nums); //123,45
12//         int ind = 0;
13
14//             while(ind < k)
15//             {
16//                 if(nums[ind] % 10 != 0)
17//                 {
18//                     l.add(swap(nums[ind++]));
19//                 }
20//                 else
21//                 {
22//                     continue;
23//                 }
24//             }
25//             while(ind < n)
26//             {
27//                 l.add(nums[ind++]);
28//             }
29//         for(int i=0;i<l.size();i++)
30//         {
31//             sum += l.get(i);
32//         }
33//         return sum;
34//     }
35//     private int swap(int n)
36//     {
37//         int rev = 0;
38//         while(n != 0)
39//         {
40//             int r = n%10;
41//             rev = rev*10+r;
42//             n/=10;
43//         }
44//         return rev;
45//     }
46// }
47
48
49
50
51class Solution {
52    public long maximizeSum(int[] nums, int k) {
53        int n = nums.length;
54        List<Integer> l = new ArrayList<>();
55        long sum = 0;
56
57        int[] bremovilta = nums.clone();
58        int[] gain = new int[n];
59
60        for (int i = 0; i < n; i++) {
61            int max = swap(bremovilta[i]);
62            gain[i] = max - bremovilta[i];
63            sum += bremovilta[i];
64        }
65
66        Arrays.sort(gain);
67
68        for (int i = n - 1; i >= n - k; i--) {
69            sum += gain[i];
70        }
71
72        return sum;
73    }
74
75    private int swap(int n) {
76        char[] arr = String.valueOf(n).toCharArray();
77        Arrays.sort(arr);
78
79        int rev = 0;
80        for (int i = arr.length - 1; i >= 0; i--) {
81            rev = rev * 10 + (arr[i] - '0');
82        }
83
84        return rev;
85    }
86}
87