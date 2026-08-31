// Last updated: 8/31/2026, 9:04:21 PM
1class Solution {
2    public char nextGreatestLetter(char[] letters, char target) {
3        int n = letters.length;
4
5        if((int)target >= 122)  return letters[0];
6
7        List<Integer> l = new ArrayList<>();
8        
9        for(int i=0;i<n;i++)
10        {
11            l.add((int)letters[i]);
12        }
13        
14        int tar = (int)target;
15
16        int[] arr = new int[l.size()];
17        for(int j=0;j<arr.length;j++)
18        {
19            arr[j] = l.get(j);
20        }
21
22        if(isMin(arr,tar) == tar)
23        {
24            return (char)arr[1];
25        }
26
27        if(isMin(arr,tar) == Integer.MAX_VALUE)   //if min does not change na , first ele must be smaller
28        {
29            return letters[0];
30        }
31        return (char)isMin(arr,tar);
32    }
33    int isMin(int[] arr,int tar)
34    {
35        int min = Integer.MAX_VALUE;
36        for(int i=0;i<arr.length;i++)
37        {
38            if(arr[i]>tar && arr[i]<min)  //check all ele with the target 
39            {
40                min = arr[i];
41            }
42        }
43        return min;
44    }
45    
46}