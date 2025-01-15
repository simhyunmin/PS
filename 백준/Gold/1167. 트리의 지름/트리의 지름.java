import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static boolean visit[];
    static ArrayList<int[]>[] graph;
    static int max = Integer.MIN_VALUE;
    static int V;
    static int maxnode = 1;

    static public void dfs(int i, int distance) {
        visit[i] = true;

        if (max < distance) {
            max = distance;
            maxnode = i;
        }

        for (int[] t : graph[i]) {
            if (!visit[t[0]]) {
                dfs(t[0], distance + t[1]);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        V = Integer.parseInt(br.readLine());
        graph = new ArrayList[V + 1];

        for (int i = 0; i <= V; i++) {
            graph[i] = new ArrayList<>();
        }

        int index, a, b;
        for (int i = 1; i <= V; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            index = Integer.parseInt(st.nextToken());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            while(st.hasMoreTokens()) {
                graph[index].add(new int[]{a, b});
                a = Integer.parseInt(st.nextToken());
                if (a == -1) {
                    break;
                }
                b = Integer.parseInt(st.nextToken());
            }
        }

        visit = new boolean[V + 1];
        dfs(1, 0);

        visit = new boolean[V + 1];
        dfs(maxnode, 0);

        System.out.println(max);



    }
}
