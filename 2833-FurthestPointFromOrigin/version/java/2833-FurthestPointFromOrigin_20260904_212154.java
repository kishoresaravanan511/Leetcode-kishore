// Last updated: 9/4/2026, 9:21:54 PM
1class Solution {
2    public int[] leftRightDifference(int[] nums) {
3        int n = nums.length;
4        int[] ans = new int[n];
5        int[] ans1 = new int[n];
6
7        for(int i=1;i<ans.length;i++) //prefix
8        {
9            ans[i] = nums[i-1]+ans[i-1];
10        }
11        for(int i=ans1.length-1;i>=1;i--)  
12        {
13            ans1[i-1] = nums[i]+ans1[i];
14        }
15        int[] res = new int[n];
16        int ind=0;
17        while(ind<n)
18        {
19            res[ind] = Math.max(ans[ind],ans1[ind]) - Math.min(ans[ind],ans1[ind]); 
20            ind++;
21        }
22        return res;
23    }
24}