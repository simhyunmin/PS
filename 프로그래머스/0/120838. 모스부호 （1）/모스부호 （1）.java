class Solution {
    public String solution(String letter) {
        StringBuilder answer = new StringBuilder();
        String [] mos = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
                      ".---","-.-",".-..","--","-.","---",".--.","--.-",
                      ".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String delimiter = " "; 
        
        String[] parts = letter.split(delimiter);
        
        for (String part : parts) {
            int index = 0;
            for (int i = 0 ; i < mos.length ; i++) {
                if (part.equals(mos[i])) {
                    index = i;
                }
            }
            answer.append((char)('a' + index));
        }
        return answer.toString();
    }
}