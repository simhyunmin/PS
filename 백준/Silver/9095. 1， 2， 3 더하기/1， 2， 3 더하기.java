import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int n = 0;
    static int result = 0;
    public static void solve(int num) {
        if (num > n) {
            return;
        }
        if (num == n) {
            result++;
            return;
        }

        solve(num + 1);
        solve(num + 2);
        solve(num + 3);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int max = 0;
        for (int i = 0; i < T; i++) {
            n = Integer.parseInt(br.readLine());
            result = 0;
            solve(0);
            System.out.println(result);
        }


    }


}
