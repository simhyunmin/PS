import java.util.*;

class Solution {
    
    public static int count(String[] array, String target) {
        int count = 0;
        for (String s : array) {
            if (s.equals(target)) {
                count++;
            }
        }
        return count;
    }
    
    public int[] solution(int n, String[] words) {
        boolean status = true;
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            // 현재 차례의 사람 번호 계산 (1부터 n까지)
            int playerNum = (i % n) + 1;
            
            // 현재 차례의 차수 계산
            int turn = (i / n) + 1;
            
            //1) 이전에 말한 단어인지
            if (!set.add(words[i])) {
                return new int[]{playerNum, turn};
                
            //2) 이전 단어의 마지막 단어를 첫 글자로 땄는지 체크
            } else if (i > 0 && words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) {
                return new int[]{playerNum, turn};
            }
        }
        return new int[]{0, 0};
    }
    
}