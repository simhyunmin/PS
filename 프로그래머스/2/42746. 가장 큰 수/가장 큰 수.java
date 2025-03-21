import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String solution(int[] numbers) {

        List<Integer> list = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.toList());

        list.sort((a, b) -> {
            String strA = Integer.toString(a);
            String strB = Integer.toString(b);

            return (strB + strA).compareTo(strA + strB);
        });

        StringBuilder result = new StringBuilder();
        for (int num : list) {
            result.append(num);
        }

        if (result.charAt(0) == '0') {
            return "0";
        } else {
            return result.toString();
        }
    }
}