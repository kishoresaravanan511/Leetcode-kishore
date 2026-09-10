// Last updated: 9/10/2026, 8:38:29 PM
1class Solution {
2    public String[] sortPeople(String[] names, int[] heights) {
3        int n = names.length;
4        Map<Integer,String> m = new HashMap<>();
5        for(int i=0;i<n;i++)
6        {
7            m.put(heights[i],names[i]);
8        }
9        String[] ans = new String[n];
10        List<Integer> l = new ArrayList<>(m.keySet());
11        Collections.sort(l,Collections.reverseOrder());
12        int ind=0;
13        for(int x : l)
14        {
15            ans[ind++] = m.get(x);
16        }
17        return ans;
18
19    }
20}