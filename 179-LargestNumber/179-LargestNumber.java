// Last updated: 8/11/2026, 2:21:39 PM
class Solution {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));   //sort according to a+b  to b+a;

        //egde case
        if(arr[0].equals("0"))
            return "0";
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            sb.append(arr[i]);
        } 
        return sb.toString();
    }
}