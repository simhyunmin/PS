import java.util.HashSet;

class Solution {
    public int solution(int[] elements) {
        int len = elements.length;
        HashSet<Integer> numbers = new HashSet<>();
        for (int i = 1; i <= len; i++) {
            for (int j = 0; j < len; j++) {
                int sum = 0;
                for (int k = 0; k < i; k++) {
                    sum += elements[(j + k) % len];
                }
                numbers.add(sum);
            }
        }
        return numbers.size();
    }
}