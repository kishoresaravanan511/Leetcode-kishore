// Last updated: 8/11/2026, 2:16:01 PM
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
         //int avg = 0;
         int sum = 0;
         int fin = 0;

         for(int i=0;i<k;i++)
         {
            sum+=arr[i];
            //avg = sum/k;
         }

         if(sum/k >=threshold)
         {
            fin++;
         }

         int st = 0;
         int end = k;

         while(end<arr.length)
         {
            sum-=arr[st];
            st++;

            sum+=arr[end];
            end++;

            //avg = sum/k;
            if(sum/k >=threshold)
            {
                fin++;    
            }
            
         }
        return fin;
    }
}