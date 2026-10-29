// Last updated: 10/29/2026, 12:12:54 PM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int min=nums[0], max=nums[0];
        for(int n: nums){
            if(n>max)
                max=n;
            else if(n<min)
                min=n;
        }

        //used hashing mechanism to solve this problem

        int[] freq = new int[max-min+1];

        for(int n: nums){
            freq[n-min]++;
        }

        for(int i=freq.length-1; i>=0; i--){
            k-=freq[i];
            if(k<=0)
                return i+min;
        }

        //as for every test case, we will get some output that's why i am returning -1
        //because this line will never execute otherwise we can throw an exception
        //for better readibility of the code
        return -1;
    }
}