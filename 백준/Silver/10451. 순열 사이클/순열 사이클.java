import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] graph;
    static boolean[] visit;
    static int count = 0;

    static void dfs(int num) {
        visit[num] = true;
        int next = graph[num];
        if (!visit[next]) {
            dfs(next);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0 ; t < T ; t++) {
            int N = Integer.parseInt(br.readLine());
            graph = new int[N + 1];
            visit = new boolean[N + 1];
            StringTokenizer st =  new StringTokenizer(br.readLine(), " ");
            for (int i = 1; i < N + 1; i++) {
                int num = Integer.parseInt(st.nextToken());
                graph[i] = num;
            }
            for (int i = 1; i < N + 1; i++) {
                if (!visit[i]) {
                    dfs(i);
                    count++;
                }

            }
            System.out.println(count);
            count = 0;
        }


    }
}
