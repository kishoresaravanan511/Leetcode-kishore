// Last updated: 11/10/2026, 10:07:09 PM
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
14        return l.toArray(new String[0]);
15        // String[] fin = new String[l.size()];
16        // for(int i=0;i<fin.length;i++)
17        // {
18        //     fin[i] = l.get(i);
19        // }
20        // return fin;
21    }
22    private boolean isContains(String s , String original)
23    {
24        for(char c : s.toCharArray())
25        {
26            if(original.indexOf(Character.toLowerCase(c)) == -1)
27            {
28                return false;
29            }
30        }
31        return true;
32    }
33}