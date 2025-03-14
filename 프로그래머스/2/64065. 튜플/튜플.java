import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;

class Solution {
    public int[] solution(String s) {
        s = s.substring(2, s.length() - 2);
        
        String[] sets = s.split("},\\{");
        Arrays.sort(sets, Comparator.comparingInt(a -> a.length()));
        
        int[][] intSets = new int[sets.length][];

        
        for (int i = 0; i < sets.length; i++) {
            String[] numbers = sets[i].split(",");
            intSets[i] = new int[numbers.length];

            for (int j = 0; j < numbers.length; j++) {
                intSets[i][j] = Integer.parseInt(numbers[j]);
            }
        }


        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();

        for (int[] intSet : intSets) {
            for (int i : intSet) {
                hashSet.add(i);
            }
        }
        int[] answer = hashSet.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}