// Last updated: 9/26/2026, 3:04:11 PM
1class Solution {
2    public String evaluate(String s, List<List<String>> knowledge) {
3        Map<String,String> m = new HashMap<>();
4        StringBuilder output = new StringBuilder();
5        for(int i=0;i<knowledge.size();i++)
6        {
7            m.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
8        }
9        for(int i=0;i<s.length();i++)
10        {
11            if(s.charAt(i) == '(')
12            {
13                StringBuilder sb = new StringBuilder();
14                i++;  //skip the braces
15                while(s.charAt(i) != ')')
16                {
17                    sb.append(s.charAt(i));
18                    i++;
19                }
20
21                if(m.containsKey(sb.toString()))
22                {
23                    output.append(m.get(sb.toString()));
24                }
25                else
26                {
27                    output.append("?");
28                }
29            }
30            else
31            {
32                output.append(s.charAt(i));
33            }
34        }
35        return output.toString();
36    }
37}