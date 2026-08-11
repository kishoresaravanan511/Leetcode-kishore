// Last updated: 8/11/2026, 2:15:48 PM
class Solution {
    public String restoreString(String s, int[] indices) {
        char[] arr = new char[s.length()];
        for(int i=0;i<arr.length;i++)
        {
            arr[indices[i]]= s.charAt(i);
        }
        return new String(arr);
    }
}