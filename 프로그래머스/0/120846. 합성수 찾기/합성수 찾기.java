import java.io.*;

class Solution {
    public int solution(int n) {
        boolean[] isPrime = new boolean[n+1];
        
        for (int i = 2 ; i <= n ; i++) {
            isPrime[i] = true;
        }
        
        for (int i = 2 ; i <= Math.sqrt(n) ; i++) {
            if(isPrime[i]) {
                for (int j = i * i ; j <= n ; j += i) {
                    isPrime[j] = false;
                }
            }
        }   
        int PrimeNum = 0;
        for (int i = 2 ; i <= n ; i++) {
            if (isPrime[i]) {
                PrimeNum++;
            }
        }
        int answer = n - PrimeNum - 1;
        return answer;
    }
}