// Last updated: 11/10/2026, 10:05:31 PM
1class Solution {
2    public String[] findWords(String[] words) {
3        List<String> l = new ArrayList<>();
4        String firstRow = "qwertyuiop";
5        String secondRow = "asdfghjkl";
6        String thirdRow = "zxcvbnm";
7        for(String x : words)
8        {
9            if(isContains(x,firstRow) || isContains(x,secondRow) || isContains(x,thirdRow))
10            {
11                l.add(x);
12            }
13        }
14        String[] fin = new String[l.size()];
15        for(int i=0;i<fin.length;i++)
16        {
17            fin[i] = l.get(i);
18        }
19        return fin;
20    }
21    private boolean isContains(String s , String original)
22    {
23        for(char c : s.toCharArray())
24        {
25            if(original.indexOf(Character.toLowerCase(c)) == -1)
26            {
27                return false;
28            }
29        }
30        return true;
31    }
32}