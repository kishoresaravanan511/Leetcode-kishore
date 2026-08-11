// Last updated: 8/11/2026, 2:16:09 PM
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int takenMin = Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++)
        {
            int currDiff=arr[i+1]-arr[i];
            takenMin = Math.min(currDiff,takenMin);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n-1;i++)
        {
            
            if(arr[i+1]-arr[i] == takenMin)
            {
                ans.add(Arrays.asList(arr[i],arr[i+1]));
            }
            
        }
        return ans;
    }
}