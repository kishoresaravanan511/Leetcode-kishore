// Last updated: 8/11/2026, 2:18:31 PM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        Map<Integer,Integer> m = new HashMap<>();

        for(int x : nums2)
        {
            while(!st.isEmpty() && x > st.peek())
            {
                m.put(st.pop(),x);
            }
            st.push(x);
        }
        int[] res = new int[nums1.length];

        for(int i=0;i<nums1.length;i++)
        {
            if(m.containsKey(nums1[i]))
            {
                res[i] = m.get(nums1[i]);
            }
            else
            {
                res[i] = -1;
            }
        }
        return res;
    }
}