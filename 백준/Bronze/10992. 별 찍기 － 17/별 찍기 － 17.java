import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            for (int j = 0; j < T - i ; j++) {
                System.out.print(" ");
            }
            if (i == T) {
                for (int j = 0 ; j < 2 * i - 1 ; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");

                for (int j = 0; j < 2 * (i - 1) - 1; j++) {
                    System.out.print(" ");
                }

                if (i != 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
