import java.util.LinkedList;
import java.util.Queue;
class Solution {

    public int solution(int[][] map) {
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        int n = map.length;
        int m = map[0].length;

        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];

        queue.offer(new int[]{0, 0, 1});
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int distance = current[2];
            if (x == n - 1 && y == m - 1) {
                return distance;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < n &&
                        ny >= 0 && ny < m &&
                        !visited[nx][ny] &&
                        map[nx][ny] == 1) {
                    queue.offer(new int[]{nx, ny, distance + 1});
                    visited[nx][ny] = true;
                }
            }

        }
        return -1;
    }
}