import java.io.*;
import java.util.*;
//10814 백준
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        String [][] arr = new String[T][2];

        for (int i = 0 ; i < T ; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }
        Arrays.sort(arr, (a1, a2) -> {
            //이 때 두 번째 열의 경우 입력된 원래의 순서가 유지된다.
            //안정 정렬인 경우
            return Integer.parseInt(a1[0]) - Integer.parseInt(a2[0]);
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < T ; i++) {
            sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
        }
        System.out.print(sb);


    }
}
