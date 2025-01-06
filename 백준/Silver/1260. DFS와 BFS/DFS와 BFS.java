import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] graph = null;
    static boolean[] visit = null;
    static List<Integer> result = null;

    public static void DFS(int start) {
        if (start < 0 || start >= graph.length || visit[start]) {
            return;
        }

        visit[start] = true;
        result.add(start);

        for (int i = 1; i < graph.length; i++) {
            if (start == i) {
                continue;
            } else if (graph[start][i] == 1) {
                DFS(i);
            }
        }
    }

    public static void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        visit[v] = true;

        while (!queue.isEmpty()) {
            int num = queue.poll();
            result.add(num);

            for (int i = 1; i < graph.length; i++) {
                if (num == i) {
                    continue;
                } else if (graph[num][i] == 1 && !visit[i]) {
                    queue.offer(i);
                    visit[i] = true;
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        graph = new int[N + 1][N + 1];
        visit = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            graph[start][end] = graph[end][start] = 1;
        }

        result = new ArrayList<>();
        DFS(V);

        StringBuilder sb = new StringBuilder();
        for (Integer data : result) {
            sb.append(data).append(" ");
        }
        sb.append("\n");

        visit = new boolean[N + 1];
        result = new ArrayList<>();

        BFS(V);
        for (Integer data : result) {
            sb.append(data).append(" ");
        }

        System.out.println(sb.toString());


    }

}
