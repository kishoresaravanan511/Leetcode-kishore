// Last updated: 8/11/2026, 2:16:27 PM
class Solution {
    public int maxTurbulenceSize(int[] arr) {
        
        int n=arr.length;
        int prev = 0;
        int ans = 1;
        int i=0;

        for(int j=1;j<n;j++)
        {
            int curr = Integer.compare(arr[j-1],arr[j]);

            if(curr == 0)
            {
                i=j;
            }
            else if(curr == prev)
            {
                i=j-1;
            }
            ans = Math.max(ans,j-i+1);
            prev = curr;
        }
        return ans;
    }
}