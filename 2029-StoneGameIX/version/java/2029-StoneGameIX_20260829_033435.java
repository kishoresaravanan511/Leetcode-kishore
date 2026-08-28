// Last updated: 8/29/2026, 3:34:35 AM
1class Solution {
2    public int[] leftRightDifference(int[] nums) {
3        int n = nums.length;
4        // List<Integer> l = new ArrayList<>();
5        // List<Integer> l1 = new ArrayList<>();
6        int[] ans = new int[n];
7        int[] ans1 = new int[n];
8
9        for(int i=1;i<ans.length;i++) //prefix
10        {
11            ans[i] = nums[i-1]+ans[i-1];
12        }
13
14        for(int i=ans1.length-1;i>=1;i--)
15        {
16            ans1[i-1] = nums[i]+ans1[i];
17        }
18
19        System.out.println(Arrays.toString(ans));
20        System.out.println(Arrays.toString(ans1));
21
22        int[] res = new int[n];
23        int ind=0;
24        while(ind<n)
25        {
26            res[ind] = Math.max(ans[ind],ans1[ind]) - Math.min(ans[ind],ans1[ind]); 
27            ind++;
28        }
29        return res;
30    }
31}