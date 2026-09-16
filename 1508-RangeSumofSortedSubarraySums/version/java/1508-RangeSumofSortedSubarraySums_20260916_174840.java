// Last updated: 9/16/2026, 5:48:40 PM
1class Solution {
2    public int rangeSum(int[] nums, int n, int left, int right) {
3        List<Integer> l = new ArrayList<>();
4        int sum=0;
5        for(int i=0;i<n;i++)
6        {
7            sum=0;
8            for(int j=i;j<n;j++)
9            {
10                sum+=nums[j];
11                l.add(sum);
12            }
13        }
14        Collections.sort(l);
15        long[] prefix = new long[l.size()+1]; //long for 10^9+7
16        prefix[0] = l.get(0);
17        for(int i=0;i<l.size();i++)
18        {
19            prefix[i+1] = prefix[i] + l.get(i);
20        }
21        System.out.println(Arrays.toString(prefix));
22        long ans = prefix[right] - prefix[left-1];  //long for given case
23        return (int)(ans % 1_000_000_007);  //common number
24    }
25}