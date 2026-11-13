// Last updated: 11/13/2026, 9:23:07 AM
1class Solution {
2    public int numJewelsInStones(String jewels, String stones) {
3        char[] arr = jewels.toCharArray();   
4        char[] arr1 = stones.toCharArray();
5        int count=0;
6
7        for(int i=0;i<arr.length;i++)
8        {
9            for(int j=0;j<arr1.length;j++)
10            {
11                if(arr[i] == arr1[j]) count++;
12            }
13        } 
14        return count;
15    }
16}