// Last updated: 8/31/2026, 8:24:10 PM
1// class Solution {
2//     public int findDuplicate(int[] nums) {
3//         int slow = nums[0];   //1
4//         int fast = nums[0];   //1
5
6//         while(true) {
7//             slow = nums[slow];  //nums[1] = 3
8//             fast = nums[nums[fast]];  //nums[3]  = 2
9
10//             if (slow == fast) {
11//                 break;
12//             }
13//         }
14
15//         int slow2 = nums[0];
16
17//         while (slow != slow2) {
18//             slow = nums[slow];
19//             slow2 = nums[slow2];
20//         }
21
22//         return slow;        
23//     }
24// }
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
42class Solution {
43    public int findDuplicate(int[] nums) {
44        int n = nums.length;
45        int[] freq = new int[n];
46        boolean flag = false;
47        int ans = 0;
48        for(int i=0;i<n;i++)
49        {
50            freq[nums[i]]++;
51            if(freq[nums[i]] > 1)
52            {
53                flag = true;
54                ans = nums[i];
55                break;
56            }
57        }
58        return ans;
59    }
60}