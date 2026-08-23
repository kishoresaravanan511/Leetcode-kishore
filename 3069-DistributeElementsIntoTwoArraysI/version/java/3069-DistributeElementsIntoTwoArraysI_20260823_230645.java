// Last updated: 8/23/2026, 11:06:45 PM
1class Solution {
2    public boolean checkDivisibility(int n) {
3       int temp = n;
4       int sum=0;
5       int pro=1;
6       while(n!=0)
7       {
8        int r = n%10;
9        sum+=r;
10        // if(r!=0)
11        pro*=r;
12        // else{
13        //     return true;
14        // }
15        n/=10;
16       } 
17       //int ans = sum+pro;
18       return temp%(sum+pro)== 0;
19    }
20}