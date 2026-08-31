// Last updated: 8/31/2026, 7:33:40 PM
1class Solution {
2    public int[] decrypt(int[] code, int k) {
3    int n=code.length;
4    int[] ans = new int[n];
5    int sum=0;
6    int st = 0;
7    int end = 0;
8
9    if(k==0)
10    {
11        return ans;   //replaced by 0...
12    }
13    else if(k>0) //fixed window of size k
14    {
15    st = 1;
16    end = k;
17    for(int i=st;i<=end;i++)
18    {
19        sum+=code[i%n];//manual window...
20    }   
21    
22    for(int i=0;i<n;i++)
23    {
24        //circular like window wowww!!!!!!
25        ans[i] = sum;
26        sum -= code[st%n];
27        st++;
28        end++;
29        sum += code[end%n];
30    }
31    }
32
33    else if(k<0)
34    {
35        k=-k;  //converted to positive
36        st = n-k; 
37        end = n-1;
38
39        for(int i=st;i<=end;i++)
40        {
41            sum+=code[i%n];   //manual window for negative case...
42        }
43
44        for(int i=0;i<n;i++)
45        {
46            ans[i] = sum;
47
48            sum-=code[st%n];
49            st++;
50
51            end++;
52            sum+=code[end%n];
53        }
54    }
55    return ans;
56    }
57}