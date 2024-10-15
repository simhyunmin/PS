class Solution {
    public int[] solution(int[] array) {
        int num = array[0];
        int index = 0;
        for(int i = 0 ; i < array.length; i++){
            if(array[i] > num){
                num = array[i];
                index = i;
            }
        }
        
        int[] answer = {num, index};
        return answer;
    }
}