import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }

        int answer = 0;

        for (int i = 0; i < discount.length; i++) {
            Map<String, Integer> copy = new HashMap<>(map);
            if (discount.length >= i + 10) {
                boolean allZero = true;
                for (int j = i; j < i + 10; j++) {
                    if (map.containsKey(discount[j])) {
                        Integer currentValue = copy.get(discount[j]);
                        copy.put(discount[j], currentValue - 1);
                    }
                }
                for (Integer value : copy.values()) {
                    if (value != 0) {
                        allZero = false;
                        break;
                    }
                }
                if (allZero) {
                    answer++;
                }
            }

        }
        return answer;
    }
}