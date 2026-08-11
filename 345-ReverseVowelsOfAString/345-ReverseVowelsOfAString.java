// Last updated: 8/11/2026, 2:19:35 PM
class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length-1;
        String vowels = "aeiouAEIOU";

        while(i<j)
        {
            while(i<j && vowels.indexOf(arr[i]) == -1)
            {
                i++;
            }
            while(i<j && vowels.indexOf(arr[j]) == -1)
            {
                j--;
            }

            char temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;

            i++;
            j--;
        }
        return new String(arr);
    }
}