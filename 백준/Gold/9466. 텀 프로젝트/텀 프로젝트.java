import java.io.*;
import java.util.*;

public class Main {
    static int[] graph;
    static boolean[] visited;
    static boolean[] finished;
    static int count;

    static void dfs(int current) {
        visited[current] = true;
        int next = graph[current];

        if (!visited[next]) {
            dfs(next);
        } else if (!finished[next]) {
            // 사이클 발견
            for (int i = next; i != current; i = graph[i]) {
                count++;
            }
            count++; // 현재 노드 포함
        }

        finished[current] = true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            graph = new int[n + 1];
            visited = new boolean[n + 1];
            finished = new boolean[n + 1];
            count = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                graph[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 1; i <= n; i++) {
                if (!visited[i]) {
                    dfs(i);
                }
            }

            System.out.println(n-count);
        }
    }
}