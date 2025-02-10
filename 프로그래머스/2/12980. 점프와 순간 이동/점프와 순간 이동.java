import java.util.*;

public class Solution {
    public int solution(int N) {
       int answer = 1;
        while(N > 1) {
            if (N % 2 == 1) {
                answer++;
            }
            N /= 2;
        }
        return answer;
    }
}