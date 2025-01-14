import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static int max = Integer.MIN_VALUE;
    static boolean visit[];
    static ArrayList<int[]> [] graph;
    static int maxNode = 1;

    static public void dfs(int i, int distance) {
        visit[i] = true;

        if (distance > max) {
            max = distance;
            maxNode = i;
        }
        for (int[] t : graph[i]) {
            if (!visit[t[0]]) {
                dfs(t[0], distance + t[1]);
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        graph = new ArrayList[n + 1];

        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        StringTokenizer st;
        for (int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            graph[a].add(new int[]{b, c});
            graph[b].add(new int[]{a, c});
        }

        visit = new boolean[n + 1];
        max = 0;
        dfs(1, 0);

        visit = new boolean[n + 1];
        max = 0;
        dfs(maxNode, 0);

        System.out.println(max);

    }
}
