import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int n;
        for (int i = 0; i < T; i++) {
            n = Integer.parseInt(br.readLine());
            int[][] stickers = new int[2][n + 1];
            int[][] dp = new int[2][n + 1];
            for (int j = 0; j < 2; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int k = 1; k <= n; k++) {
                    stickers[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            dp[0][1] = stickers[0][1];
            dp[1][1] = stickers[1][1];

            if (n >= 2) {
                dp[0][2] = stickers[0][2] + dp[1][1];
                dp[1][2] = stickers[1][2] + dp[0][1];
            }

            for (int j = 3; j <= n; j++) {
                dp[0][j] = Math.max(dp[1][j - 1], dp[1][j - 2]) + stickers[0][j];
                dp[1][j] = Math.max(dp[0][j - 1], dp[0][j - 2]) + stickers[1][j];
            }

            System.out.println(Math.max(dp[0][n], dp[1][n]));

        }
    }

}
