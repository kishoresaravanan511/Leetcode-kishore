// Last updated: 10/23/2026, 10:08:51 AM
1class Solution {
2    public int[] limitOccurrences(int[] nums, int k) {
3        int n = nums.length;
4        int left = 0;
5        int c=0;
6        List<Integer> l = new ArrayList<>();
7
8        for(int right=0;right<n;right++)
9        {
10            while(nums[right] != nums[left])  //only if two are not equal
11            {
12                left++; //left is towards n
13                c=0;  //new element is seen
14            }
15            c++;  //element count
16
17            if(c <= k)  //given condition
18            {
19                l.add(nums[right]);
20            }
21        }
22        int[] res = new int[l.size()];
23        for(int i=0;i<l.size();i++)  //copying to result array
24        {
25            res[i] = l.get(i);
26        }
27        return res;
28    }
29}