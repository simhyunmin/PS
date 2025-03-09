import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] cloth : clothes) {
            map.merge(cloth[1], 1, Integer::sum);
        }
        int answer = 1;
        for (Integer value : map.values()) {
            answer *= (value + 1);
        }
        return answer - 1;
    }
}