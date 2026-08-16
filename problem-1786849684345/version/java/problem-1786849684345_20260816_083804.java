// Last updated: 8/16/2026, 8:38:04 AM
1class Solution {
2    public int nearestDrone(int[][] drones, int[] target) {
3        int n = drones.length;
4        int minDist = Integer.MAX_VALUE;
5        int minIndex = -1;
6        for(int i=0;i<n;i++)
7            {
8                int x = drones[i][0];
9                int y = drones[i][1];
10                int range = drones[i][2];
11                
12                int distance = Math.abs(x-target[0]) + Math.abs(y-target[1]);
13
14                if(distance  <=  range   &&  distance < minDist)
15                {
16                    minDist = distance;
17                    minIndex = i;
18                }
19            }
20        return minIndex;
21    }
22}