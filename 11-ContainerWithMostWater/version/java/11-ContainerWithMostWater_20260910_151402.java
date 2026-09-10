// Last updated: 9/10/2026, 3:14:02 PM
1class Solution {
2    public List<String> letterCombinations(String digits) {
3         int[] arr = {2,3,4,5,6,7,8,9};
4         String[] str = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
5         Map<Integer,String> m = new HashMap<>();
6         List<String> ans = new ArrayList<>();
7         StringBuilder sb = new StringBuilder();
8
9         //just mapping the ph.no
10         for(int i=0;i<arr.length;i++)
11         {
12            m.put(arr[i],str[i]);
13         }
14
15         backtrack(0,digits,m,ans,sb);   //backtracks and try all with other solutions
16
17         return ans;
18
19    }
20
21    public void backtrack(int index,String digits,Map<Integer,String> m,List<String> ans,StringBuilder sb)
22    {
23        if(index == digits.length())   //base case  , this should return nothing  
24        {
25            ans.add(sb.toString());   //add the sb to ans  , if digits.length() == index;
26            return;
27
28            //ad,ae,af,bd,be,bf,cd,ce,cf all possibilitites.
29        }
30
31        int digit = digits.charAt(index) - '0';  //taking '2' - '0' = 2;
32        String letters = m.get(digit);  //get(2) value from map.
33        
34        //for example 23
35        for(int i=0;i<letters.length();i++)
36        {
37            sb.append(letters.charAt(i)); //first add the first char a to sb;
38            backtrack(index+1,digits,m,ans,sb); //calls with 3 and add ab;
39            sb.deleteCharAt(sb.length()-1);  //delete b and try with another char in map(3) i.e def
40        }
41        
42    }
43}