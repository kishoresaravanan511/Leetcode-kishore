// Last updated: 10/26/2026, 7:25:59 PM
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int i=0;
4        int j=numbers.length-1;
5        while(i<j)
6        {
7            if(numbers[i]+numbers[j] == target)
8            {
9                return new int[]{i+1,j+1};
10            }
11            else if(numbers[i]+numbers[j]<target)
12            {
13                i++;
14            }
15            else
16            {
17                j--;
18            }
19            
20        }
21        return new int[]{};
22    }
23}