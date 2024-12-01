class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int index = 0;
        //약수 개수 구하기
        for (int count = 1; count <= n; count++){
            if (n % count == 0) {
                index++;
            }
        }
        answer = new int[index];
        int count = 0;
        //배열에 집어넣기
        for (int i = 1; i <= n; i++){
            if (n % i == 0) {
                answer[count] = i;
                count++;
            }
        }
        return answer;
    }
}