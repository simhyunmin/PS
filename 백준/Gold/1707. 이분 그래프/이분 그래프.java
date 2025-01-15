import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<Integer>[] graph;
    static int[] colors;
    static int V, E;

    static public boolean dfs(int num, int color) {
        colors[num] = color;

        for (int next : graph[num]) {
            if (colors[next] == 0) {
                if (!dfs(next, -color)) return false;
            } else if (colors[next] == colors[num]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            V = Integer.parseInt(st.nextToken());
            E = Integer.parseInt(st.nextToken());

            graph = new ArrayList[V + 1];
            for (int j = 1; j <= V; j++) {
                graph[j] = new ArrayList<>();
            }

            colors = new int[V + 1];

            for (int j = 0; j < E; j++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                graph[a].add(b);
                graph[b].add(a);
            }
            boolean check = true;

            for (int j = 1; j <= V; j++) {
                if (colors[j] == 0) {
                    if (!dfs(j, 1)) {
                        check = false;
                        break;
                    }
                }
            }

            System.out.println(check ? "YES" : "NO");
        }
    }
}
