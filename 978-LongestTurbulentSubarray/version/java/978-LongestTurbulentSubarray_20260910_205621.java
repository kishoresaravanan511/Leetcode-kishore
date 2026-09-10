// Last updated: 9/10/2026, 8:56:21 PM
1class Solution {
2    public int maxTurbulenceSize(int[] arr) {
3        
4        int n=arr.length;
5        int prev = 0;
6        int ans = 1;
7        int i=0;
8
9        for(int j=1;j<n;j++)
10        {
11            //a > b => 1
12            //a < b => -1
13            //a==b => 0
14            int curr = Integer.compare(arr[j-1],arr[j]);  //just a static method of wrapper Integer class.
15
16            //instead of this method
17            /*
18            //manual compare
19            if(arr[j-1]<arr[j])     curr=-1;
20            else if(arr[j-1] > arr[j])      curr = 1;
21            else    curr = 0;
22            */
23
24
25            if(curr == 0)   //edge special case..   so comes first maintain order.
26            {
27                i=j;   //restart the turbulent sequence.
28            }
29            else if(curr == prev)
30            {
31                i=j-1;  //eliminate previous window element
32            }
33            ans = Math.max(ans,j-i+1);
34            prev = curr;   //mark the curr to previous
35        }
36        return ans;
37    }
38}