// Last updated: 9/1/2026, 2:15:48 PM
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
15
16    for(int i=0;i<nums.length;i++){
17        int ans = target-nums[i];
18        if(m.containsKey(ans))
19        {
20            return new int[] {i,m.get(ans)};
21        }
22        m.put(nums[i],i);
23    }
24    return new int[]{};
25    }
26}