// Last updated: 8/11/2026, 2:14:48 PM
class Solution {
    public int distinctAverages(int[] nums) {
      Arrays.sort(nums); 

      if(nums.length == 2)      return 1;

      int i = 0;
      int j = nums.length-1;
      Set<Double> s = new HashSet<>();
      int c = 0;
      while(i<j)
      {
        s.add((nums[i] + nums[j]) / 2.0);
            //c++;
        i++;
        j--;
      }
      System.out.println(s);
      return s.size();
    }
}