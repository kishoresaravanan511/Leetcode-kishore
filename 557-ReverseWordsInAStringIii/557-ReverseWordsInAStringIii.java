// Last updated: 8/11/2026, 2:18:23 PM
class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        int n = arr.length;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++)
        {
            sb.append(revString(arr[i]));
            if(i<n-1)   //remove trailing zeros becoz, we don't need space after the end of the inside string.
                sb.append(" ");
        }
        return String.valueOf(sb);
    }
    public String revString(String str)
    {
        char[] ch = str.toCharArray();
        int i=0;
        int j=ch.length-1;

        while(i<=j)
        {
            char temp = ch[j];
            ch[j] = ch[i];
            ch[i] = temp;
            i++;
            j--;
        }
        return new String(ch);
    }
}