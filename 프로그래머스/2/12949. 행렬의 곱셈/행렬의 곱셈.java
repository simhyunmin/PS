class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {

        int[][] answer = new int[arr1.length][arr2[0].length];
        int i, j, k;
        int index = 0;
        int sum = 0;
        
        for (i = 0; i < arr1.length; i++) {
            for (j = 0; j < arr2[0].length; j++) {
                sum = 0;
                for (k = 0; k < arr2.length; k++) {
                    sum += arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = sum;
            }
        }
        return answer;
    }
}