import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer> graph = new ArrayList<>();
    static int P;

    static void dfs(String A) {
        int nextNum = 0;
        for (char c : A.toCharArray()) {
            nextNum += Math.pow(c - '0', P);
        }

        if (!graph.contains(nextNum)) {
            graph.add(nextNum);
            dfs(String.valueOf(nextNum));
        } else {
            System.out.println(graph.indexOf(nextNum));
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        P = Integer.parseInt(st.nextToken());
        graph.add(Integer.parseInt(A));
        dfs(A);
        System.out.println();


    }
}
