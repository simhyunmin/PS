import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
    
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < speeds.length; i++) {
            int lastDay = ((100 - progresses[i]) % speeds[i] > 0) ? ((100 - progresses[i]) / speeds[i]) + 1 : (100 - progresses[i]) / speeds[i];
            queue.add(lastDay);
        }

        Stack<Integer> answer = new Stack<>();
        int index = 0;
        int time = queue.peek();
        int popCount = 0;
        while (!queue.isEmpty()) {
            if(time < queue.peek()) {
                time = queue.peek();
                answer.push(popCount);
                popCount = 0;
                index++;
            } else {
                popCount++;
                queue.poll();
            }
        }
        if (popCount > 0) {
            answer.push(popCount);
        }

        int[] array = answer.stream()
                .mapToInt(i -> i)
                .toArray();
        return array;
    }
}