// Last updated: 10/24/2026, 10:23:09 PM
1class Solution {
2    public String restoreString(String s, int[] indices) {
3        char[] arr = new char[s.length()];
4        for(int i=0;i<arr.length;i++)
5        {
6            arr[indices[i]]= s.charAt(i);
7        }
8        return new String(arr);
9    }
10}