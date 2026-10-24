// Last updated: 10/24/2026, 10:17:45 PM
1class Solution {
2    public String toGoatLatin(String sentence) {
3        int n = sentence.length();
4        String[] arr = sentence.split(" ");
5        StringBuilder sb = new StringBuilder();
6        int k = 1;
7        for(int i=0;i<arr.length;i++)
8        {
9            StringBuilder str = new StringBuilder(arr[i]);
10            if(!isVowel(str.charAt(0)))
11            {
12                char need = str.charAt(0);
13                str.deleteCharAt(0);
14                str.append(need);
15            }
16            
17            str.append("ma");
18
19            for(int j=0;j<k;j++)
20            {
21                str.append("a");
22            }
23            sb.append(str);
24            if(i < arr.length-1)
25            {
26                sb.append(" ");
27            }
28            k++;
29        }
30        return sb.toString();
31    }
32    private boolean isVowel(char x)
33    {
34        char c = Character.toLowerCase(x);
35        switch(c)
36        {
37            case 'a':
38                return true;
39            case 'e':
40                return true;
41            case 'i':
42                return true;
43            case 'o':
44                return true;
45            case 'u':
46                return true;
47        }
48        return false;
49    }
50}