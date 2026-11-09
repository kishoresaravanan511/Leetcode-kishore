// Last updated: 11/9/2026, 11:19:04 PM
1class Solution {
2    public boolean isLongPressedName(String name, String typed) {
3        int namedInd = 0;
4        int typedInd = 0;
5
6        while(typedInd <= typed.length()-1){
7            if(name.charAt(namedInd) == typed.charAt(typedInd)) {
8                int currIndex = typedInd;
9                if(typedInd+1 < typed.length()-1) {
10                    while ((typed.charAt(currIndex) == typed.charAt(typedInd + 1))
11                     && (name.charAt(namedInd == name.length()-1 ? namedInd : namedInd+1) != typed.charAt(typedInd + 1))) {
12                        typedInd++;
13                    }
14                }
15                typedInd++;
16
17                if(typedInd > typed.length()-1 && namedInd < name.length()-1) {
18                    return false;
19                }
20
21                if(namedInd != name.length()-1) {
22                    namedInd++;
23                }
24            } else {
25                return false;
26            }
27        }
28
29        if(namedInd != name.length()-1) {
30            return false;
31        }
32
33        return true;
34    }
35
36}