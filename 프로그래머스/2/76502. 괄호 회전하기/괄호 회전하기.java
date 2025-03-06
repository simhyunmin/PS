import java.util.Stack;

class Solution {
     public static Boolean checkChar(String s) {
        int len = s.length();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') return false;
            } else if (c == '}') {
                if (stack.isEmpty() || stack.pop() != '{') return false;
            } else if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') return false;
            }
        }
        return stack.isEmpty();
    }
    
    public int solution(String s) {
        int answer = 0;
        for (int x = 0; x < s.length(); x++) {
            String lotation = "";
            for (int i = 0; i < s.length(); i++) {
                lotation += String.valueOf(s.charAt((i + x) % s.length()));
            }
            if (checkChar(lotation)) {
                answer += 1;
            }
        }
        return answer;
    }
}