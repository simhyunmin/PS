import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int [][] graph;
    static boolean visit[][];
    static int ax[] = {0, 0, 1, -1};
    static int ay[] = {1, -1, 0, 0};
    static int min = Integer.MAX_VALUE;

    static public void dfs(int y, int x, int num) {
        visit[y][x] = true;
        graph[y][x] = num;
        for (int i = 0; i < 4; i++) {
            int uy = y + ay[i];
            int ux = x + ax[i];
            if (uy < 0 || ux < 0 || uy >= graph.length || ux >= graph.length) {
                continue;
            }
            if(visit[uy][ux] || graph[uy][ux]!=1) {
                continue;
            }

            dfs(uy, ux, num);
        }
    }

    static public void bfs(int y, int x, int num) {
        Queue<Integer[]> queue = new LinkedList<>();
        visit = new boolean[graph.length][graph.length];
        visit[y][x] = true;
        queue.add(new Integer[] {y, x, 0});

        while (!queue.isEmpty()) {
            Integer temp[] = queue.poll();
            int uy = temp[0];
            int ux = temp[1];
            int count = temp[2];

            if (graph[uy][ux] != 0 && graph[uy][ux] != num) {
                min = Math.min(min, count - 1);
            }
            if (count > min) {
                return;
            }

            for (int i = 0; i < 4; i++) {
                int nextY = uy + ay[i];
                int nextX = ux + ax[i];
                if (nextY < 0 || nextX < 0 || nextY >= graph.length || nextX >= graph.length) {
                    continue;
                }

                if (graph[nextY][nextX] == num) {
                    continue;
                }
                if (visit[nextY][nextX]) {
                    continue;
                }
                queue.add(new Integer[]{nextY, nextX, count + 1});
                visit[nextY][nextX] = true;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        int N = Integer.parseInt(br.readLine());
        graph = new int[N][N];
        visit = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int landNum = 3;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visit[i][j] && graph[i][j] == 1) {
                    dfs(i, j, landNum);
                    landNum++;
                }
            }
        }

        //bfs 부분
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph.length; j++) {
                if (graph[i][j] > 1) {
                    bfs(i, j, graph[i][j]);
                }
            }
        }

        System.out.println(min);

    }
}
