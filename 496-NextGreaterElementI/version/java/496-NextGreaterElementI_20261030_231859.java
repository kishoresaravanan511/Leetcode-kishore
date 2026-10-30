// Last updated: 10/30/2026, 11:18:59 PM
1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        Stack<Integer> st = new Stack<>();   
4        Map<Integer,Integer> m = new HashMap<>();   //key value pairs...
5
6        for(int x : nums2)   //iterating nums2
7        {
8            while(!st.isEmpty() && x > st.peek())   //compare current element in nums2 with stack's peek element.
9            {
10                m.put(st.pop(),x); //put key as popped element and nums2 as value and popped element is deleted in stack and nextly stack gets empty.
11            }
12            st.push(x);  //if while fails push te nums2 value into stack 
13        }
14        int[] res = new int[nums1.length];   //we noted that final array size is same as nums1 length.
15
16        for(int i=0;i<nums1.length;i++)   //iterating over nums1 times
17        {
18            if(m.containsKey(nums1[i]))  //containsKey checks for , if our map contains key as nums1's element , only checks key
19            {
20                res[i] = m.get(nums1[i]);   //get() is used for fetch the value respective to key , nd stores the o/p to corresponding index position.
21            }
22            else
23            {
24                res[i] = -1;  // if key is not found in our map , it is denoted as -1 , not found.
25            }
26        }
27        return res;  //return the resultant array.
28    }
29}