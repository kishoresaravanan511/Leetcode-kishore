// Last updated: 10/5/2026, 3:33:33 PM
1class Solution {
2    public int threeSumClosest(int[] nums, int target) {
3        Arrays.sort(nums);
4        int n = nums.length;
5        int closest = nums[0]+nums[1]+nums[2];   //assume
6
7        for(int i=0;i<n;i++)
8        {
9            int j = i+1;
10            int k = n-1;
11
12            while(j<k)
13            {
14                int sum = nums[i]+nums[j]+nums[k];
15                if(Math.abs(sum-target) < Math.abs(closest-target))
16                {
17                    closest = sum;
18                }
19                if(sum == target)
20                {
21                    return sum;
22                }
23                else if(sum < target)
24                {
25                    j++;
26                }
27                else
28                {
29                    k--;
30                }
31            }
32        }
33        return closest;
34    }
35}