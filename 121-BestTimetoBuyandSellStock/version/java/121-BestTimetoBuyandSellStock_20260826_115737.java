// Last updated: 8/26/2026, 11:57:37 AM
1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        
4        // int[] indexS = new int[200]; 
5        // int[] indexT = new int[200]; 
6        
7        // int len = s.length();
8        
9        // if(len != t.length()) {
10        //     return false;
11        // }
12        
13        // for(int i = 0; i < len; i++) {
14            
15        //     if(indexS[s.charAt(i)] != indexT[t.charAt(i)]) {
16        //         return false; 
17        //     }
18            
19            
20        //     indexS[s.charAt(i)] = i + 1; 
21        //     indexT[t.charAt(i)] = i + 1;
22        // }
23        
24       
25        // return true;
26
27        Map<Character,Integer> m = new HashMap<>();
28        Map<Character,Integer> targetMap = new HashMap<>();
29
30        //mapping with indexex for better clarity and some edge cases...
31        for(Integer i=0;i<s.length();i++)
32        {
33            char a = s.charAt(i);
34            char b = t.charAt(i);
35
36            if(m.get(a) == targetMap.get(b))
37            {
38                m.put(a,i);
39                targetMap.put(b,i);
40            }
41            else
42            {
43                return false;
44            }
45        }
46        return true;
47    }
48}
49