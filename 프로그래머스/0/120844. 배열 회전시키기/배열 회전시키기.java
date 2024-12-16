class Solution {
    public int[] solution(int[] numbers, String direction) {
        int size = numbers.length;
        if (direction.equals("right")) {
            int lastNum = numbers[size - 1];
            for(int i = size - 1; i > 0 ; i--) {
                numbers[i] = numbers[i-1];
            }
            numbers[0] = lastNum;
        } else if(direction.equals("left")) {
            int firstNum = numbers[0];
            for(int i = 0; i < size - 1 ; i++) {
                numbers[i] = numbers[i+1];
            }
            numbers[size - 1] = firstNum;
        }
        return numbers;
    }
}