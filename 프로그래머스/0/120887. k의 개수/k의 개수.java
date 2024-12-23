class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(; i <= j ; i++) {
            String str = String.valueOf(i);
            int orglength = str.length();
            int newlength = str.replace(String.valueOf(k), "").length();
            int count = orglength - newlength;
            answer += count;
        }
        return answer;
    }
}