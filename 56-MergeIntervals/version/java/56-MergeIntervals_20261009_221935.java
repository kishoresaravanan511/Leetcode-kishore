// Last updated: 10/9/2026, 10:19:35 PM
1class Solution {
2    public int[][] merge(int[][] intervals) {
3        // //Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
4
5        // if(intervals == null  || intervals.length<=1)
6        // {
7        //     return intervals;
8        // }  
9        // //custom sorting
10        // Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0])); 
11
12        // int n = intervals.length;
13        // List<int[]> ans = new ArrayList<>();
14
15        // for(int i=0;i<n;i++)
16        // {
17        //     int st = intervals[i][0];  //every time change 00 and 01 as st and end
18        //     int en = intervals[i][1];
19
20        //     //purposefully for checking the interval is overlapped by second is smaller than previous second
21        //     if(!ans.isEmpty() && en<=ans.get(ans.size()-1)[1])
22        //     {
23        //         continue;
24        //     }
25        //     for(int j=i+1;j<n;j++)
26        //     {
27        //         if(intervals[j][0] <= en)   //second starting is less than previous second.
28        //         {
29        //             en = Math.max(en,intervals[j][1]);
30        //         }
31        //         else
32        //         {
33        //             break;
34        //         }
35        //     }
36        //     ans.add(new int[]{st,en});  //every time creates new array
37        // }
38
39        // return ans.toArray(new int[ans.size()][]);  //print row according to list with copy of list.
40
41//-------------------------------------------------------------------------------------
42    
43    if(intervals == null || intervals.length == 1)  return intervals;
44
45    //sorting according to first index in jagged array.
46    Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
47    List<int[]> ans = new ArrayList<>();
48
49    for(int i=0;i<intervals.length;i++)
50    {
51        int st = intervals[i][0];
52        int end = intervals[i][1];
53
54        if(!ans.isEmpty() && end<=ans.get(ans.size()-1)[1])
55        {
56            continue;
57        }
58        for(int j=i+1;j<intervals.length;j++)
59        {
60            if(intervals[j][0]<=end)
61            {
62                end = Math.max(end,intervals[j][1]);
63            }
64            else
65            {
66                break;
67            }
68        }
69        ans.add(new int[]{st,end});
70    }
71    return ans.toArray(new int[ans.size()][]);
72    }
73}