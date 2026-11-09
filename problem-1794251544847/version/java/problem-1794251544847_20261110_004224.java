// Last updated: 11/10/2026, 12:42:24 AM
1class Solution {
2    public List<String> commonChars(String[] words) {
3         List<String> list =  new ArrayList<>();
4        if(words.length == 1) {
5            for(Character c : words[0].toCharArray()) {
6                list.add(String.valueOf(c));
7            }
8            return list;
9        }
10       
11        for(int i=0; i<words[0].length(); i++) {
12            String currCharacter = String.valueOf(words[0].charAt(i));
13            boolean found = false;
14            for(int j=1;j<words.length;j++)
15            {
16                StringBuilder sb = new StringBuilder(words[j]);
17                if(sb.toString().contains(currCharacter) && sb.indexOf(currCharacter) != -1)
18                {
19                    found = true;
20                    sb.deleteCharAt(sb.indexOf(currCharacter));
21                    words[j] = sb.toString();
22                }
23                else
24                {
25                    found = false;
26                    break;
27                }
28            }
29            if(found)
30            {
31                list.add(currCharacter);
32            }
33        }
34        return list;
35    }
36}