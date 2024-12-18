import java.util.*;

class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        char[] my_char = my_string.toCharArray();
        Arrays.sort(my_char);
        String answer = new String(my_char);
        return answer;
    }
}