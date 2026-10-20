// Last updated: 10/20/2026, 8:30:29 PM
1class Solution {
2    public List<Integer> targetIndices(int[] nums, int target) {
3        int n = nums.length;
4        List<Integer> l = new ArrayList<>();
5        // Arrays.sort(nums);
6        // int low = 0;
7        // int high = n-1;
8        // for(int i=0;i<n;i++)
9        // {
10        //     if(nums[i] == target)
11        //     {
12        //         l.add(i);
13        //     }
14        // }
15        // return l;
16
17        int less = 0;
18        int equal = 0;
19        for(int x : nums)
20        {
21            if(x < target)  less++;
22            else if(x == target) equal++;
23        }
24        for(int i=0;i<equal;i++)
25        {
26            l.add(less+i);
27        }
28        return l;
29    }
30}