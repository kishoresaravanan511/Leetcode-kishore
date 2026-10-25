// Last updated: 10/25/2026, 9:24:10 AM
1class Solution {
2    public long maximizeSum(int[] nums, int k) {
3        int n = nums.length;
4        long sum = 0;
5
6        int[] bremovilta = nums.clone();  //copy
7        int[] gain = new int[n];
8
9        for (int i = 0; i < n; i++) {  //running sum and find the diff in orig and rev in gain array
10            int max = swap(bremovilta[i]);
11            gain[i] = max - bremovilta[i];
12            sum += bremovilta[i];
13        }
14
15        Arrays.sort(gain);
16
17        for (int i = n - 1; i >= n - k; i--) {  //for k time 
18            sum += gain[i];
19        }
20
21        return sum;
22    }
23
24    private int swap(int n) {
25        char[] arr = String.valueOf(n).toCharArray();
26        Arrays.sort(arr);
27
28        int rev = 0;
29        for (int i = arr.length - 1; i >= 0; i--) {
30            rev = rev * 10 + (arr[i] - '0');
31        }
32
33        return rev;
34    }
35}
36