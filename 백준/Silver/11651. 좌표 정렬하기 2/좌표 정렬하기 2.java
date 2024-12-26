import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        int [][] arr = new int[T][2];

        for (int i = 0 ; i < T ; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, (a1, a2) -> {
            if (a1[1] == a2[1]) {
                return a1[0] - a2[0];
            }
            else {
                return a1[1] - a2[1];
            }
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < T ; i++) {
            sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
        }
        System.out.print(sb);


    }
}
