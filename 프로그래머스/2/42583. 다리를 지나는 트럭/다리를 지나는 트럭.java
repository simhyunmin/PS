import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();

        //1. 스택에 다리 길이 초과 안 하는 지 && 최대 견딜 수 있는 무게 초과 안 하는 지 검증
        //2. 조건에 일치하면 스택에 추가
        //스택에 추가함과 동시에 시간 증가(걍 추가하면 시간 증가시키면 될듯)
        int time = 0;
        int currentWeight = 0;
        int truckIndex = 0;

        for (int i = 0; i < bridge_length; i++) {
            bridge.offer(0);
        }

        while (!bridge.isEmpty()) {
            // 시간 증가
            time++;

            // 다리에서 트럭 빼기
            currentWeight -= bridge.poll();

            // 새 트럭 추가 여부 결정
            if (truckIndex < truck_weights.length) {
                // 무게 조건 확인
                if (currentWeight + truck_weights[truckIndex] <= weight) {
                    bridge.offer(truck_weights[truckIndex]);
                    currentWeight += truck_weights[truckIndex];
                    truckIndex++;
                } else {
                    bridge.offer(0);
                }
            }
        }
        return time;

    }
}