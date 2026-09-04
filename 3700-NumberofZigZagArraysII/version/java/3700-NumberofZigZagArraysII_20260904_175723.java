// Last updated: 9/4/2026, 5:57:23 PM
1class Solution {
2    public int[] resultArray(int[] nums) {
3        List<Integer> l = new ArrayList<>();
4        List<Integer> l1 = new ArrayList<>();
5        l.add(nums[0]);
6        l1.add(nums[1]);
7
8        for(int i=2;i<nums.length;i++)
9        {
10            int last1 = l.get(l.size()-1);
11            int last2 = l1.get(l1.size()-1);
12            if(last1 > last2)
13            {
14                l.add(nums[i]);
15            }
16            else
17            {
18                l1.add(nums[i]);
19            }
20        }
21        int[] ans = new int[nums.length];
22        int ind = 0;
23        for(int x : l)
24        {
25            ans[ind++] = x;
26        }
27        for(int y : l1)
28        {
29            ans[ind++] = y;
30        }
31
32        return ans;
33    }
34}