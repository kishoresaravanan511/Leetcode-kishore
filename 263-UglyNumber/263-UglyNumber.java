// Last updated: 8/11/2026, 2:20:23 PM
public class Solution {
public boolean isUgly(int num) {
	if (num > 0)
		for (int i : new int[] { 2, 3, 5 }) {
			while (num % i == 0) {
				num /= i;
			}
		}
	return num == 1;
}
}