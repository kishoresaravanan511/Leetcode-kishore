// Last updated: 8/11/2026, 2:21:13 PM
class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        // int[] indexS = new int[200]; 
        // int[] indexT = new int[200]; 
        
        // int len = s.length();
        
        // if(len != t.length()) {
        //     return false;
        // }
        
        // for(int i = 0; i < len; i++) {
            
        //     if(indexS[s.charAt(i)] != indexT[t.charAt(i)]) {
        //         return false; 
        //     }
            
            
        //     indexS[s.charAt(i)] = i + 1; 
        //     indexT[t.charAt(i)] = i + 1;
        // }
        
       
        // return true;

        Map<Character,Integer> m = new HashMap<>();
        Map<Character,Integer> targetMap = new HashMap<>();

        for(Integer i=0;i<s.length();i++)
        {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if(m.get(a) == targetMap.get(b))
            {
                m.put(a,i);
                targetMap.put(b,i);
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
