// Last updated: 8/11/2026, 2:17:34 PM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] arr = jewels.toCharArray();   
        char[] arr1 = stones.toCharArray();
        int count=0;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                if(arr[i] == arr1[j]) count++;
            }
        } 
        return count;
    }
}