// Last updated: 9/30/2026, 9:59:10 AM
1class Solution {
2    public int totalNumbers(int[] digits) {
3        int n = digits.length;
4        int[] freq = new int[10];
5        int count = 0;
6        for(int d : digits)
7        {
8            freq[d]++;
9        }
10        for(int h=1;h<=9;h++)  //hundreds
11        {
12            if(freq[h] == 0)
13            {
14                continue;
15            }
16            else
17            {
18                freq[h]--;
19            }
20
21            for(int t=0;t<=9;t++) //tens
22            {
23                if(freq[t] == 0)
24                {
25                    continue;
26                }
27                else
28                {
29                    freq[t]--;
30                }
31
32                for(int o = 0;o<=9;o+=2)  //ones
33                {
34                    if(freq[o] > 0)
35                    {
36                        count++;
37                    }
38                }
39                freq[t]++;
40            }
41            freq[h]++;
42        }
43        return count;
44    }
45}