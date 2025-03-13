class Solution {
    static int maxCount = 0;
    
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        explore(k, dungeons, visited, 0);
        return maxCount;
    }
    
    public static void explore(int hp, int[][] dungeons, boolean[] visited, int count) {
        maxCount = Math.max(maxCount, count);

        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && hp >= dungeons[i][0]) {
                visited[i] = true;
                explore(hp - dungeons[i][1], dungeons, visited, count + 1);
                visited[i] = false;
            }
        }

    }
}