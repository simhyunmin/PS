import java.io.*;
import java.util.*;
//10825 백준
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        String [][] arr = new String[T][4];

        for (int i = 0 ; i < T ; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
            arr[i][2] = st.nextToken();
            arr[i][3] = st.nextToken();
        }
        Arrays.sort(arr, (a1, a2) -> {
            if (a1[1].equals(a2[1])) {
                if(a1[2].equals(a2[2])) {
                    if(a1[3].equals(a2[3])) {
                        return a1[0].compareTo(a2[0]);
                    }
                    return Integer.parseInt(a2[3]) - Integer.parseInt(a1[3]);
                }
                return Integer.parseInt(a1[2]) - Integer.parseInt(a2[2]);
            }
            return Integer.parseInt(a2[1]) - Integer.parseInt(a1[1]);
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < T ; i++) {
            sb.append(arr[i][0]).append('\n');
        }
        System.out.print(sb);


    }
}
