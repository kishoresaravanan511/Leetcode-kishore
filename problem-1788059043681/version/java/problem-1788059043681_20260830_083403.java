// Last updated: 8/30/2026, 8:34:03 AM
1class Solution {
2    public int countSpecialIntegers(int[] nums) {
3        int n = nums.length;
4        Map<Integer,Integer> m = new HashMap<>();
5
6        int count = 0;
7        for(int i=0;i<n;i++)
8            {
9                if(i==0  || nums[i] != nums[i-1])
10                {
11                    m.put(nums[i],m.getOrDefault(nums[i],0)+1);
12                }
13            }
14
15        for(int x : m.values())
16            {
17                if(x == 1)
18                {
19                    count++;
20                }
21            }
22        return count;
23    }
24}