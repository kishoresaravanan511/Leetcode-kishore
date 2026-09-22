// Last updated: 9/22/2026, 9:29:21 PM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        int n = strs.length;
4
5//     HashMap<String,List<String>> map = new HashMap<>();
6//     for(String s : strs)
7//     {
8//         char[] arr = s.toCharArray();
9//         Arrays.sort(arr);
10//         String key = new String(arr);
11
12//         if(!map.containsKey(key))
13//         {
14//             map.put(key,new ArrayList<>());
15//         }
16//         map.get(key).add(s);
17//     }
18//     return new ArrayList<>(map.values());
19//     }
20// }
21
22
23
24    HashMap<String,List<String>> m = new HashMap<>();
25    for(String s : strs)
26    {
27        char[] ch = s.toCharArray();
28        Arrays.sort(ch);
29        String cleaned = new String(ch);
30
31        if(!m.containsKey(cleaned))  //if it is new cleaned , then only we create a new string Arraylist for separate anagrams.else,we add the string to the map
32        {
33            m.put(cleaned,new ArrayList<>());
34        }
35        m.get(cleaned).add(s);  //
36    }
37    return new ArrayList<>(m.values());  //return only the values of hashmap in inside arraylist.
38    }
39}