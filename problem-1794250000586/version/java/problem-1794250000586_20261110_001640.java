// Last updated: 11/10/2026, 12:16:40 AM
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
12            String currChar = String.valueOf(words[0].charAt(i));
13            boolean hasSame = false;
14            for(int j=1; j<words.length;j++) {
15                StringBuilder currCompareStr = new StringBuilder(words[j]);
16                if(currCompareStr.toString().contains(currChar)) {
17                    hasSame = true;
18                    currCompareStr.deleteCharAt(currCompareStr.indexOf(currChar));
19                    words[j] = currCompareStr.toString();
20                } else {
21                    hasSame = false;
22                    break;
23                }
24            }
25
26            if(hasSame) {
27                list.add(currChar);
28            }
29        }
30        return list;
31    }
32}