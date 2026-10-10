// Last updated: 10/10/2026, 9:53:34 PM
1class Solution {
2    public int eraseOverlapIntervals(int[][] intervals) {
3        //custom sorting...
4        Arrays.sort(intervals,(a,b)->a[1]==b[1]?b[0]-a[0]:a[1]-b[1]);  //ifa[1]==b[1] means descending order of 0th index and , else ascending order of 1th index.
5        int count = 0;
6        int end = Integer.MIN_VALUE;   //-infinity assume
7        for(int[] movie : intervals){   //each and every time checks the inside array of 0th index to iterate i.e movie[0]  , in 1st case 1,2,1,3
8            if(movie[0]>=end)
9                end = movie[1];
10            else
11                count++;
12        }
13        return count;
14    }
15}