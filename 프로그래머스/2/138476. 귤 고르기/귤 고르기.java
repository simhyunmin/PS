import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
       //중복되는 귤 배열로부터 저장하는 리스트 만들어서
        // {size : 개수} 느낌으로 리스트에 저장
        // {"2" : 4, "1" : 3, "3" : 2}
        // 이런식으로 내림차순 하면 서로 다른 종류의 수 최솟값 구할 수 있음
        // 여기서 계산 공식 적용 -> 수확할 귤 개수 처음 탐색할 때 만족하면 그것만 카운트
        //만족 안 하면 다음꺼 탐색하면서 만족할 때까지 귤 탐색
        // 만약 개수 같은 게 있으면 오름차순이든 내림차순이든 상관없을듯
        int answer = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        
        for (int num : tangerine) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        List<Map.Entry<Integer, Integer>> sortList = new ArrayList<>(countMap.entrySet());
        sortList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        for (Map.Entry<Integer, Integer> i : sortList) {
            int num = i.getValue();
            if (num >= k) {
                answer++;
                return answer;
            } else {
                k -= num;
                answer++;
            }
        }

        return answer;
    }
}