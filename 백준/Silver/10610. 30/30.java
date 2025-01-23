import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();

        int[] arr = new int[N.length()];

        for (int i = 0; i < N.length(); i++) {
            arr[i] = N.charAt(i) - '0';
        }
        int sum = 0;
        boolean hasZero = false;

        for (int i = 0; i < N.length(); i++) {
            arr[i] = N.charAt(i) - '0';
            sum += arr[i];
            if (arr[i] == 0) {
                hasZero = true;
            }
        }

        if (sum % 3 != 0 || !hasZero) {
            System.out.println(-1);
            return;
        }

        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }

        System.out.println(sb.toString());


    }
}
