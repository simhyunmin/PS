import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> arr = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (arr.size() == 0) {
                arr.push(s.charAt(i));
            } else {
                if (s.charAt(i) == arr.peek()) {
                    arr.pop();
                } else {
                    arr.push(s.charAt(i));
                }
            }
        }
        if (arr.size() > 0) {
            return 0;
        } else {
            return 1;
        }
    }
}