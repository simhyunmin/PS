import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        int [][] arr = new int[T][2];

        for (int i = 0 ; i < T ; i++) {
            String str = br.readLine();
            st = new StringTokenizer(str);
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, (a1, a2) -> {
            if (a1[0] == a2[0]) {
                return a1[1] - a2[1];
            }
            else {
                return a1[0] - a2[0];
            }
        });

        for (int[] k : arr) {
            for (int num : k) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}
