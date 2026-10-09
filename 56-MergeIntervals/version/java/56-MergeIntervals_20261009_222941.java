// Last updated: 10/9/2026, 10:29:41 PM
1class Solution{
2
3    //custom sort 
4    Comparator<int[]> com = new Comparator<>()
5    {
6        @Override
7        public int compare(int[] i,int[] j)
8        {
9            if(i[0] > j[0])
10            {
11                return 1;
12            }
13            else if(i[0] < j[0])
14            {
15                return -1;
16            }
17            else
18            {
19                return 0;
20            }
21        }
22    };
23    public int[][] merge(int[][] intervals) {    
24    if(intervals == null || intervals.length == 1)  return intervals;
25
26    //sorting according to first index in jagged array.
27    Arrays.sort(intervals,com);  //manual sorting custom comparator
28
29    List<int[]> ans = new ArrayList<>();
30
31    for(int i=0;i<intervals.length;i++)
32    {
33        int st = intervals[i][0];
34        int end = intervals[i][1];
35
36        if(!ans.isEmpty() && end<=ans.get(ans.size()-1)[1])
37        {
38            continue;
39        }
40        for(int j=i+1;j<intervals.length;j++)
41        {
42            if(intervals[j][0]<=end)
43            {
44                end = Math.max(end,intervals[j][1]);
45            }
46            else
47            {
48                break;
49            }
50        }
51        ans.add(new int[]{st,end});
52    }
53    return ans.toArray(new int[ans.size()][]);
54    }
55}