import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        char[] arr = my_string.toCharArray();
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            if ((48 <= (int)arr[i]) && ((int)arr[i] <= 57)) {
                count++;
            }
        }
        int[] answer = new int[count];
        
        for(int i = 0, cnt = 0 ; i < arr.length ; i++) {
            if ((48 <= (int)arr[i]) && ((int)arr[i] <= 57)) {
                answer[cnt] = arr[i] - '0';
                cnt++;
            }
        }
        Arrays.sort(answer);
        
        return answer;
    }
}