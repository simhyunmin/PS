import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(int)Math.ceil((double)n/2)];
        int arrCount = 0;
        for(int i = 1; i <= n ; i++){
            if((i & 0x01) == 1){
                answer[arrCount] = i; 
                arrCount++;
            }
        }
        return answer;
    }
}