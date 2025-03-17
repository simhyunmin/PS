import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        return solve(priorities, location);
    }
    public static int solve(int[] priorities, int location) {
        // 프로세스 정보를 저장할 큐
        Queue<Process> queue = new LinkedList<>();
        
        // 우선순위 내림차순으로 정렬된 큐
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        
        // 큐와 우선순위 큐 초기화
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new Process(i, priorities[i]));
            priorityQueue.offer(priorities[i]);
        }
        
        int order = 0;
        
        while (!queue.isEmpty()) {
            Process current = queue.poll();
            
            // 현재 프로세스의 우선순위가 가장 높지 않으면 큐의 끝으로 이동
            if (current.priority < priorityQueue.peek()) {
                queue.offer(current);
            } else {
                // 실행 순서 증가
                order++;
                priorityQueue.poll();
                
                // 찾고자 하는 프로세스라면 현재 순서 반환
                if (current.id == location) {
                    return order;
                }
            }
        }
        
        return -1; // 오류 케이스
    }
    
    // 프로세스 클래스 정의
    static class Process {
        int id;       // 프로세스 ID (원래 위치)
        int priority; // 프로세스 우선순위
        
        Process(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }
}