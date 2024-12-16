class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        char[] strArray = my_string.toCharArray();
        char temp = strArray[num1]; 
        
        strArray[num1] = strArray[num2];
        strArray[num2] = temp;
        answer = new String(strArray);
        return answer;
    }
}