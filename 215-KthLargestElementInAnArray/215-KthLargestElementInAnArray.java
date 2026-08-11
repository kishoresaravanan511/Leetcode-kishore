// Last updated: 8/11/2026, 2:21:00 PM
public class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Arrays.sort(nums);
        // return nums[nums.length - k];
         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
         for(int x:nums)
         {
            pq.add(x);
         }
         for(int i=1;i<k;i++)
         {
            pq.poll();
         }
         return pq.poll();
    }
}