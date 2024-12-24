import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer parts = new StringTokenizer(br.readLine());
        Integer[] p = new Integer[2];

        for (int i = 0; i < 2; i++) {
            p[i] = Integer.parseInt(parts.nextToken());
        }
        System.out.println(p[0] + p[1]);
    }
}
