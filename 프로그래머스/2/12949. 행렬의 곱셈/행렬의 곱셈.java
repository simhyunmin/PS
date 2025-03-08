class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {

        int[][] answer = new int[arr1.length][arr2[0].length];
        int row1, col2, row2;
        int index = 0;
        int sum = 0;
        
        for (row1 = 0; row1 < arr1.length; row1++) {
            for (col2 = 0; col2 < arr2[0].length; col2++) {
                sum = 0;
                for (row2 = 0; row2 < arr2.length; row2++) {
                    //행렬의 곱셈은 첫 번째 행렬의 열과 두 번째 행렬의 크기가 같아야 함
                    //따라서, col1 == row2
                    sum += arr1[row1][row2] * arr2[row2][col2];
                }
                //행렬의 곱으로 만들어지는 새로운 행렬의 크기는
                //첫 번째 행렬의 행의 사이즈와 두 번째 행렬의 열의 사이즈만큼의 크기를 가진다.
                answer[row1][col2] = sum;
            }
        }
        return answer;
    }
}