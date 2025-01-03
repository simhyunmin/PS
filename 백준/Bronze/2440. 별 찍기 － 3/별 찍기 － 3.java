import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0 ; i < T ; i++) {
            for (int j = T-i ; j > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
