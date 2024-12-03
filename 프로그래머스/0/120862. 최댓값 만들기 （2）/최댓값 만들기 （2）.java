class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int sum = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] * numbers[j] > sum) {
                    sum = numbers[i] * numbers[j];
                }
            }
        }
        answer = sum;
        return answer;
    }
}