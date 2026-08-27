// Last updated: 8/27/2026, 3:14:20 PM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        int n = strs.length;
4        
5    //     List<List<String>> ans = new ArrayList<>();
6    //     boolean[] visited = new boolean[n];
7    //     for(int i=0;i<n;i++)
8    //     {
9    //         if(visited[i])
10    //             continue;
11
12    //         List<String> l = new ArrayList<>();
13    //         l.add(strs[i]);
14    //         visited[i] = true;
15
16    //         for(int j=i+1;j<n;j++)
17    //         {
18    //             if(!visited[j] && isAnagram(strs[i],strs[j]))
19    //             {
20    //                 l.add(strs[j]);
21    //                 visited[j] = true;
22    //             }
23    //         }
24    //         ans.add(l);
25    //     }
26    //     return  ans;
27    // }
28    // boolean isAnagram(String s , String s1)
29    // {
30    //     if(s.length() != s1.length())   return false;
31    //     int[] freq = new int[26];
32        
33    //     char[] arr = s.toCharArray();
34    //     char[] arr1 = s1.toCharArray();
35
36    //     for(int x:arr)
37    //     {
38    //         freq[x-'a']++;
39    //     }
40    //     for(int y:arr1)
41    //     {
42    //         freq[y-'a']--;
43    //     }
44
45    //     for(int z:freq)
46    //     {
47    //         if(z!=0)
48    //             return false;
49    //     }
50    //     return true;
51
52
53//     HashMap<String,List<String>> map = new HashMap<>();
54//     for(String s : strs)
55//     {
56//         char[] arr = s.toCharArray();
57//         Arrays.sort(arr);
58//         String key = new String(arr);
59
60//         if(!map.containsKey(key))
61//         {
62//             map.put(key,new ArrayList<>());
63//         }
64//         map.get(key).add(s);
65//     }
66//     return new ArrayList<>(map.values());
67//     }
68// }
69
70
71
72    HashMap<String,List<String>> m = new HashMap<>();
73    for(String s : strs)
74    {
75        char[] ch = s.toCharArray();
76        Arrays.sort(ch);
77        String cleaned = new String(ch);
78
79        if(!m.containsKey(cleaned))  //if it is new cleaned , then only we create a new string Arraylist for separate anagrams.else,we add the string to the map
80        {
81            m.put(cleaned,new ArrayList<>());
82        }
83        m.get(cleaned).add(s);  //
84    }
85    return new ArrayList<>(m.values());  //return only the values of hashmap in inside arraylist.
86    }
87}