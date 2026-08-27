// Last updated: 8/27/2026, 9:35:22 AM
1class Solution {
2    public int[] arrayRankTransform(int[] arr) { //keep the original array as it is.
3        int n = arr.length;
4        int[] needToBeSorted = arr.clone();   //why we need another extra space , original is used in the last , so we sorted arr na it gets altered.
5        Arrays.sort(needToBeSorted);
6        int ind = 1;
7        Map<Integer,Integer> m = new HashMap<>();
8
9        for(int x : needToBeSorted)
10        {
11            if(!m.containsKey(x))  //only key is not present in the map
12                m.put(x,ind++);  //for rank purpose , we put key as arr elements.
13        }
14        int[] res = new int[arr.length];
15        for(int i=0;i<n;i++)
16        {
17            res[i] = m.get(arr[i]);  //copying the values from map with arr to new array.
18        }
19        return res;
20    }
21}