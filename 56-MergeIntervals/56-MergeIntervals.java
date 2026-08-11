// Last updated: 8/11/2026, 2:23:34 PM
class Solution {
    public int[][] merge(int[][] intervals) {
        // //Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));

        // if(intervals == null  || intervals.length<=1)
        // {
        //     return intervals;
        // }  
        // //custom sorting
        // Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0])); 

        // int n = intervals.length;
        // List<int[]> ans = new ArrayList<>();

        // for(int i=0;i<n;i++)
        // {
        //     int st = intervals[i][0];  //every time change 00 and 01 as st and end
        //     int en = intervals[i][1];

        //     //purposefully for checking the interval is overlapped by second is smaller than previous second
        //     if(!ans.isEmpty() && en<=ans.get(ans.size()-1)[1])
        //     {
        //         continue;
        //     }
        //     for(int j=i+1;j<n;j++)
        //     {
        //         if(intervals[j][0] <= en)   //second starting is less than previous second.
        //         {
        //             en = Math.max(en,intervals[j][1]);
        //         }
        //         else
        //         {
        //             break;
        //         }
        //     }
        //     ans.add(new int[]{st,en});  //every time creates new array
        // }

        // return ans.toArray(new int[ans.size()][]);  //print row according to list with copy of list.

//-------------------------------------------------------------------------------------
    
    if(intervals == null || intervals.length == 1)  return intervals;

    //sorting according to first index in jagged array.
    Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
    List<int[]> ans = new ArrayList<>();

    for(int i=0;i<intervals.length;i++)
    {
        int st = intervals[i][0];
        int end = intervals[i][1];

        if(!ans.isEmpty() && end<=ans.get(ans.size()-1)[1])
        {
            continue;
        }
        for(int j=i+1;j<intervals.length;j++)
        {
            if(intervals[j][0]<=end)
            {
                end = Math.max(end,intervals[j][1]);
            }
            else
            {
                break;
            }
        }
        ans.add(new int[]{st,end});
    }
    return ans.toArray(new int[ans.size()][]);
    }
}