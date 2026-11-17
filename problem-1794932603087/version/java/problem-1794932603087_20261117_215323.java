// Last updated: 11/17/2026, 9:53:23 PM
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        int n = nums.length;
4        for(int i=0;i<n;i++)
5        {
6            nums[i] = nums[i]*nums[i];
7        }
8        
9        return insertionSort(nums);
10    }
11    private int[] insertionSort(int[] arr)
12    {
13        for(int i=0;i<arr.length;i++)
14        {
15            int j = i;
16            while(j > 0 && arr[j-1] > arr[j])
17            {
18                int temp = arr[j-1];
19                arr[j-1] = arr[j];
20                arr[j] = temp;
21
22                j--;
23            }
24        }
25        return arr;
26    }
27}