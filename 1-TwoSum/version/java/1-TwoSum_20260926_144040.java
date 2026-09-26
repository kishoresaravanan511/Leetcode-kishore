// Last updated: 9/26/2026, 2:40:40 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        // int i=0,j=0;
4        // for(i=0;i<nums.length;i++)
5        // {
6        //     for(j=i+1;j<nums.length;j++)
7        //     {
8        //         if(nums[i] + nums[j] == target)
9        //             return new int[] {i,j};
10        //     }
11        // }
12        // return new int[]{};
13
14    Map<Integer,Integer> m = new HashMap<>();
15        for(int i=0;i<nums.length;i++)
16        {
17            if(m.containsKey(target-nums[i]))
18            {
19                return new int[]{i,m.get(target-nums[i])};
20            }
21            m.put(nums[i],i);
22        }
23    return new int[]{};
24    }
25}