// Last updated: 10/11/2026, 9:20:17 AM
1class Solution {
2    public List<Integer> maxPrimes(int n, int s) {
3        List<Integer> res = new ArrayList<>();
4        boolean[] arr = new boolean[n+1];
5        Arrays.fill(arr,true);
6            if(n >= 0)   arr[0] = false;
7            if(n >= 1)    arr[1] = false;
8
9        for(int i=2;i<=n/i;i++)
10        {
11            if(arr[i])
12            {
13                for(int j=i*i;j<=n;j+=i)
14                {
15                    arr[j] = false;
16                }
17            }
18        }
19        for(int i=2;i<=n;i++)
20        {
21            if(arr[i])
22            {
23                res.add(i);
24            }
25        }
26        List<Integer> ans = new ArrayList<>();
27        long sum = 0;
28        for(int x : res)
29            {
30                if(x+sum > s)
31                {
32                    break;
33                }
34                sum+=x;
35                ans.add(x);
36            }
37        return ans;
38    }
39}