/*
Given two numbers n and k. We need to find out if n can be written as sum of k
prime numbers.

 Notice

n <= 10 ^ 9

Goldbach's conjecture

Example
Given n = 10, k = 2
Return true   // 10 = 5 + 5

Given n = 2, k = 2
Return false
 */
public class CheckSumOfKPrimes {

    /*
     * @param : an int
     * @param : an int
     * @return: if N can be expressed in the form of sum of K primes, return
     * true; otherwise, return false.
     */
    public boolean isSumOfKPrimes(int n, int k) {
        if (n < 2 * k) {
            return false;
        }
        boolean[] prime = isPrime(n);
        if (k == 1) {
            return prime[n];
        }
        if (k > 2) {
            return true;
        }
        // k == 2;
        for (int i = 2; i <= n / 2; ++i) {
            if (prime[i] && prime[n - i]) {
                return true;
            }
        }
        return false;
    }

    public boolean[] isPrime(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for (int i = 2; i * i <= n; ++i) {
            if (prime[i]) {
                for (int j = i; j * i <= n; ++j) {
                    prime[i * j] = false;
                }
            }
        }
        return prime;
    }

}
