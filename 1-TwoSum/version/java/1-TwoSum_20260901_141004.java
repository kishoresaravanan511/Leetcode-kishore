// Last updated: 9/1/2026, 2:10:04 PM
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
14    Map<Integer,Integer> hm=new HashMap<>();
15
16    for(int i=0;i<nums.length;i++){
17        hm.put(nums[i],i);
18    }
19
20    for(int i=0;i<nums.length;i++)
21    {
22        int ans = target-nums[i];
23        if(hm.containsKey(ans) && hm.get(ans) != i)
24        {
25            return new int[]{i,hm.get(ans)};
26        }
27    }
28    return new int[] {};
29    }
30}