// Last updated: 8/11/2026, 2:15:04 PM
class Solution {
    public String reversePrefix(String word, char ch) {
        // int n = word.length();
        // int ind = word.indexOf(ch);
        // char[] arr = word.toCharArray();
        // if(ind == -1)  
        //     return word;

        // int i=0;
        // int j=ind;
        int j=0;
        while(j<word.length() && word.charAt(j) != ch){
            j++;
        }
        if(j == word.length())      return word;

        char[] arr = word.toCharArray();
        int i=0;
        while(i<=j)
        {
            char temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
        return new String(arr);
        
    }
}