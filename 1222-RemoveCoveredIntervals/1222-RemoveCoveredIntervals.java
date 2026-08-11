// Last updated: 8/11/2026, 2:16:17 PM
class Solution {
    public int removeCoveredIntervals(int[][] intervals) {

        if(intervals.length==1 || intervals == null)    return 1;
        
        int n = intervals.length;
        int c = 0;

        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> ans = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            boolean flag = false;
            int a = intervals[i][0];
            int b = intervals[i][1];

            // if(!ans.isEmpty() && b<=ans.get(ans.size()-1)[1])
            // {
            //     continue;
            // }
            for(int j=0;j<n;j++)
            {
                if(i==j)    continue;
                if((intervals[j][0] <= a) && (b <= intervals[j][1]))
                {
                    flag = true;
                    break;
                    // a = Math.min(a,intervals[j][0]);
                    // b = Math.max(b,intervals[j][1]);
                }
                // else
                // {
                //     //ans.add(new int[]{a,b});
                //     break;
                // }
            }
            if(flag)   c++;
           // ans.add(new int[]{a,b});
        }
        
        return n-c;
        //return ans.size();
    }
}