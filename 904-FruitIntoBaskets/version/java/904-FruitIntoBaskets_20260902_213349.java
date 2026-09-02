// Last updated: 9/2/2026, 9:33:49 PM
1class Solution {
2    public int totalFruit(int[] fruits) {
3        int left = 0;
4        int max = 0;
5        Map<Integer,Integer> m = new HashMap<>();
6
7        for(int right=0;right<fruits.length;right++)
8        {
9            m.put(fruits[right],m.getOrDefault(fruits[right],0)+1);
10
11            while(m.size() > 2) //exceeds basket size(2)
12            {
13                m.put(fruits[left],m.get(fruits[left])-1);  //negotiate the left frequency by one
14
15                if(m.get(fruits[left]) == 0)  //if it's freq is 0,it is no more.
16                {
17                    m.remove(fruits[left]);  //window shrinking using map 
18                }
19                left++;  //anyway window expanding..
20            }
21            max = Math.max(max,right-left+1);  //max no of fruits
22        }
23        return max;
24    }
25}