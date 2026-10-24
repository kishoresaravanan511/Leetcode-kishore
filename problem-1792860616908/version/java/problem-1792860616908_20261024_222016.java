// Last updated: 10/24/2026, 10:20:16 PM
1class Solution {
2    public String toGoatLatin(String sentence) {
3        String[] arr = sentence.split(" ");
4        StringBuilder result = new StringBuilder();
5        int k = 1;
6        for(int i=0;i<arr.length;i++)
7        {
8            StringBuilder word = new StringBuilder(arr[i]);
9            if(!isVowel(word.charAt(0)))
10            {
11                char need = word.charAt(0);
12                word.deleteCharAt(0);
13                word.append(need);
14            }
15            
16            word.append("ma");
17
18            for(int j=0;j<k;j++)
19            {
20                word.append("a");
21            }
22            result.append(word);
23
24            if(i < arr.length-1)
25            {
26                result.append(" ");
27            }
28
29            k++;
30        }
31        return result.toString();
32    }
33    private boolean isVowel(char x)
34    {
35        char c = Character.toLowerCase(x);
36        switch(c)
37        {
38            case 'a':
39                return true;
40            case 'e':
41                return true;
42            case 'i':
43                return true;
44            case 'o':
45                return true;
46            case 'u':
47                return true;
48        }
49        return false;
50    }
51}