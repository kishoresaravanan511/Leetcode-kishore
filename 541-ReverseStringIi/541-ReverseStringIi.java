// Last updated: 8/11/2026, 2:18:24 PM
class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        
        for(int m=0;m<arr.length;m+=2*k)
        {
            int i = m;
            int j = Math.min(arr.length-1,i+k-1);

        while(i < j)
        {
            char temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;;
        }
        }
        return new String(arr);
    }
}