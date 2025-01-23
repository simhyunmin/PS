import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int maxTeam = Integer.MIN_VALUE;

        for (int i = 0; i <= K; i++) {
            int m = M - i;
            int w = N - (K - i);

            int count = w / 2;
            if (count <= m) {
            } else {
                count = m;
            }
            if (maxTeam < count) {
                maxTeam = count;
            }
        }
        System.out.println(maxTeam);
    }
}
