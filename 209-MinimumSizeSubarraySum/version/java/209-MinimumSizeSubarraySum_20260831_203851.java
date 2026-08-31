// Last updated: 8/31/2026, 8:38:51 PM
1class Solution {
2    public boolean isPerfectSquare(int num) {
3        int low = 1; //0 is not valid no more  for square purpose
4        int high = num;
5
6        while(low<=high)
7        {
8            int mid = low+(high-low)/2;
9            long sq = (long)mid*mid;  //for long integers...
10            if(sq==num)
11            {
12                return true;
13            }
14            else if(sq < num)
15            {
16                low=mid+1;
17            }
18            else
19            {
20                high = mid-1;
21            }
22        }
23        return false;
24    }
25}