// Last updated: 11/14/2026, 3:30:45 PM
1class Solution {
2    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
3        int[] arr = new int[nums.size()];
4        int minSum = Integer.MAX_VALUE;
5        for(int i=0;i<nums.size();i++)
6        {
7            arr[i] = nums.get(i);
8        }
9        for(int i=0;i<arr.length;i++)
10        {
11            int sum = 0;
12            for(int j=i;j<arr.length;j++)
13            {
14                int n = j-i+1;
15                sum += arr[j];
16                if(sum > 0 && n >= l && n <= r)
17                {
18                    minSum = Math.min(minSum,sum);
19                }
20            }
21        }
22        if(minSum == Integer.MAX_VALUE) return -1;
23        return minSum;
24    }
25}