// Last updated: 10/10/2026, 9:51:57 PM
1class Solution {
2    public int countPrimes(int n) {
3        if (n <= 2) return 0;
4
5        boolean[] isPrime = new boolean[n];
6        Arrays.fill(isPrime, true);
7
8        isPrime[0] = false;
9        isPrime[1] = false;
10
11        for (int i = 2; i * i < n; i++) {
12            if (isPrime[i]) {
13                for (int j = i * i; j < n; j += i) {
14                    isPrime[j] = false;
15                }
16            }
17        }
18
19        int count = 0;
20        for (boolean prime : isPrime) {
21            if(prime) count++;
22        }
23
24        return count;
25    }
26}