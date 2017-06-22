/*
Given a positive integer n, find the least number of perfect square numbers 
(for example, 1, 4, 9, 16, ...) which sum to n.

For example, given n = 12, return 3 because 12 = 4 + 4 + 4; given n = 13, 
return 2 because 13 = 4 + 9.
 */
public class PerfectSquares {

    public int numSquares(int n) {

    }

    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            if ((int) Math.pow(Math.sqrt(i), 2) == i) {
                dp[i] = 1;
            } else {
                int minNum = Integer.MAX_VALUE;
                for (int j = 1; j * j < i; ++j) {
                    minNum = Math.min(minNum, dp[i - j * j] + 1);
                }
            }
        }
        return dp[n];
    }

}
