// Last updated: 9/24/2026, 8:45:37 PM
1class Solution {
2    public String reverseWords(String s) {
3        String[] arr = s.split(" ");
4        int n = arr.length;
5        StringBuilder sb = new StringBuilder();
6        for(int i=0;i<n;i++)
7        {
8            sb.append(revString(arr[i]));
9            if(i<n-1)   //remove trailing zeros becoz, we don't need space after the end of the inside string.
10                sb.append(" ");
11        }
12        return sb.toString();
13    }
14    public String revString(String str)
15    {
16        char[] ch = str.toCharArray();
17        int i=0;
18        int j=ch.length-1;
19
20        while(i<=j)
21        {
22            char temp = ch[j];
23            ch[j] = ch[i];
24            ch[i] = temp;
25            i++;
26            j--;
27        }
28        return new String(ch);
29    }
30}