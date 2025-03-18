class Solution {
    
    static int count = 0;
    static boolean[] visited;
    
    public int solution(int[] numbers, int target) {
        visited = new boolean[numbers.length];

        dfs(numbers, 0, 0, target);
        
        return count;
    }
    
    static void dfs(int[] numbers, int num, int sum ,int target) {
        if (num == numbers.length && sum == target) {
            count++;
            return;
        } else if (num == numbers.length) {
            return;
        }
        visited[num] = true;
        dfs(numbers, num + 1, sum + numbers[num], target);
        dfs(numbers, num + 1, sum - numbers[num], target);
    }
}