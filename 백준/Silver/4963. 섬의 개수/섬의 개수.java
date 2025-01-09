import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
    static int[][] graph;
    static boolean[][] visit;
    static int count;
    static int h;
    static int w;

    static void dfs(int x, int y) {
        visit[x][y] = true;

        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx >= h || ny >= w) continue;
            if (!visit[nx][ny] && graph[nx][ny] == 1) {
                dfs(nx, ny);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if (w == 0 && h == 0) break;

            graph = new int[h][w];
            visit = new boolean[h][w];
            count = 0;

            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    graph[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (!visit[i][j] && graph[i][j] == 1) {
                        dfs(i, j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}