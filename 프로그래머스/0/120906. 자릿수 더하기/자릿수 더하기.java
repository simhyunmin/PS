class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int count = n ; count > 0 ; count /= 10 ) {
            
            if (count / 10 > 0) {
                answer += count % 10;
            } else {
                answer += count;
                break;
            }
        }
        
        return answer;
    }
}
