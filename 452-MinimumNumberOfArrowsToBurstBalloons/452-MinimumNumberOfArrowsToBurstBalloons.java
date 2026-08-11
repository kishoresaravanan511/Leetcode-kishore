// Last updated: 8/11/2026, 2:18:42 PM
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b) -> Integer.compare(a[1],b[1]));
        long end = Long.MIN_VALUE;
        int arrow = 0;

        for(int[] baloon:points)
        {
            if(baloon[0] <= end)
            {
                continue;
            }
            else
            {
                arrow++;
                end = baloon[1];  //12
            }
        }
        return arrow;
    }
}