// Last updated: 9/23/2026, 8:51:53 PM
1class Solution {
2    public String reverseStr(String s, int k) {
3        char[] arr = s.toCharArray();
4        
5        for(int m=0;m<arr.length;m+=2*k)   //iterating 2k elements
6        {
7            int i = m;
8            int j = Math.min(arr.length-1,i+k-1);   //to find next element of i..
9
10        //ordinary swaping
11        while(i < j)
12        {
13            char temp = arr[j];
14            arr[j] = arr[i];
15            arr[i] = temp;
16            i++;
17            j--;
18        }
19        }
20        return new String(arr);   ///char array to string...
21    }
22}