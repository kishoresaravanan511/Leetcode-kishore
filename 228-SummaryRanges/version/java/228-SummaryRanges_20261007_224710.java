// Last updated: 10/7/2026, 10:47:10 PM
1class Solution {
2    public List<String> summaryRanges(int[] nums) {
3        int n = nums.length;
4        List<String> l = new ArrayList<>();
5        int i=0;
6        while(i < n)
7        {
8            int start = nums[i];
9            int j = i;
10
11            while(j+1 < n && nums[j+1] == nums[j] + 1)
12            {
13                j++;
14            }
15
16            if(nums[j] == start)
17            {
18                l.add(String.valueOf(start));
19            }
20            else
21            {
22                StringBuilder sb = new StringBuilder();
23                sb.append(start);
24                sb.append("->");
25                sb.append(nums[j]);
26                l.add(sb.toString());
27            }
28            i = j+1; //for check next valid range
29        }
30        return l;
31    }
32}