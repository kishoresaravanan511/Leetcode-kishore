// Last updated: 10/9/2026, 10:27:47 PM
1class Solution{
2     Comparator<int[]> com = new Comparator<>()
3    {
4        @Override
5        public int compare(int[] i,int[] j)
6        {
7            if(i[0] > j[0])
8            {
9                return 1;
10            }
11            else if(i[0] < j[0])
12            {
13                return -1;
14            }
15            else
16            {
17                return 0;
18            }
19        }
20    };
21    public int[][] merge(int[][] intervals) {
22        // //Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
23
24        // if(intervals == null  || intervals.length<=1)
25        // {
26        //     return intervals;
27        // }  
28        // //custom sorting
29        // Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0])); 
30
31        // int n = intervals.length;
32        // List<int[]> ans = new ArrayList<>();
33
34        // for(int i=0;i<n;i++)
35        // {
36        //     int st = intervals[i][0];  //every time change 00 and 01 as st and end
37        //     int en = intervals[i][1];
38
39        //     //purposefully for checking the interval is overlapped by second is smaller than previous second
40        //     if(!ans.isEmpty() && en<=ans.get(ans.size()-1)[1])
41        //     {
42        //         continue;
43        //     }
44        //     for(int j=i+1;j<n;j++)
45        //     {
46        //         if(intervals[j][0] <= en)   //second starting is less than previous second.
47        //         {
48        //             en = Math.max(en,intervals[j][1]);
49        //         }
50        //         else
51        //         {
52        //             break;
53        //         }
54        //     }
55        //     ans.add(new int[]{st,en});  //every time creates new array
56        // }
57
58        // return ans.toArray(new int[ans.size()][]);  //print row according to list with copy of list.
59
60//-------------------------------------------------------------------------------------
61    
62    if(intervals == null || intervals.length == 1)  return intervals;
63
64    //sorting according to first index in jagged array.
65    Arrays.sort(intervals,com);
66
67    //Collections.sort(intervals,com);
68    List<int[]> ans = new ArrayList<>();
69
70    for(int i=0;i<intervals.length;i++)
71    {
72        int st = intervals[i][0];
73        int end = intervals[i][1];
74
75        if(!ans.isEmpty() && end<=ans.get(ans.size()-1)[1])
76        {
77            continue;
78        }
79        for(int j=i+1;j<intervals.length;j++)
80        {
81            if(intervals[j][0]<=end)
82            {
83                end = Math.max(end,intervals[j][1]);
84            }
85            else
86            {
87                break;
88            }
89        }
90        ans.add(new int[]{st,end});
91    }
92    return ans.toArray(new int[ans.size()][]);
93    }
94}