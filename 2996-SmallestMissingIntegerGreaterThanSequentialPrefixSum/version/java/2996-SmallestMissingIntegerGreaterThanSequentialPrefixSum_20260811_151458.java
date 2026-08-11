// Last updated: 8/11/2026, 3:14:58 PM
1class Solution {
2    public int missingInteger(int[] nums) {
3        Set<Integer> s = new HashSet<>();
4        int prefix = nums[0];
5
6        for(int i=1;i<nums.length;i++)
7        {
8            if(nums[i] == nums[i-1]+1)  //it is a sequence..
9            {
10                prefix+=nums[i];
11            }
12            else
13            {
14                break;
15            }
16        }
17        for(int x : nums)
18        {
19            s.add(x);
20        }
21        while(s.contains(prefix))
22        {
23            prefix++;
24        }
25        return prefix;
26    }
27}