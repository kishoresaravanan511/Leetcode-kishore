// Last updated: 8/11/2026, 2:19:02 PM
class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for(int x : nums)
        {

            if(x==first || x==second || x==third)   continue;
            if(x>first)
            {
                third = second;
                second = first;
                first = x;
            }
            else if(x>second)
            {
                third = second;
                second = x;
            }
            else if(x>third)
            {
                third = x;
            }
        }
        return third == Long.MIN_VALUE ? (int)first : (int)third;
    }
}