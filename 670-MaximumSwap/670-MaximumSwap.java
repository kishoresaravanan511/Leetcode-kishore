// Last updated: 8/11/2026, 2:18:05 PM
class Solution {
    public int maximumSwap(int num) {
      char[] arr = Integer.toString(num).toCharArray();

      for(int i=0;i<arr.length;i++)
      {
        int ind = i;

        for(int j=arr.length-1;j>i;j--)
        {
            if(arr[ind] < arr[j])
                ind = j;
        }

        if(ind!=i && arr[i] < arr[ind])
        {
            char temp = arr[i];
            arr[i] = arr[ind];
            arr[ind] = temp;
            return Integer.parseInt(new String(arr));
        }
      }
      return num;  
    }
}