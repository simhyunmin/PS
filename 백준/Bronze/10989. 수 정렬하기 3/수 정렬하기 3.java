import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[Integer.parseInt(br.readLine())];

        for (int i = 0 ; i < arr.length ; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < arr.length ; i++) {
            sb.append(arr[i]).append('\n');
        }
        System.out.print(sb);


    }
}
