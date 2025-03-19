import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int s : scoville) {
            minHeap.offer(s);
        }

        int operations = 0;
        while (minHeap.size() > 1 && minHeap.peek() < K) {
            int mixed = minHeap.remove() + (minHeap.remove() * 2);
            minHeap.offer(mixed);
            operations++;
        }
        return ((minHeap.peek() < K) ? -1 : operations);
    }
}