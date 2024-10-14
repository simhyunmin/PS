class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for (int i = 0; i < my_string.length(); i++) {
            char n = my_string.charAt(i);
            if (n >= '0' && n <= '9') {
                answer += n - '0';
            }
        }
        return answer;
    }
}
