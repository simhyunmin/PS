import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        
        for (int i = 0; i < n; i++) {
            int h = n - i; // i번째부터 끝까지의 논문 수
            if (citations[i] >= h) {
                return h;
            }
        }
        
        return 0;
    }
}