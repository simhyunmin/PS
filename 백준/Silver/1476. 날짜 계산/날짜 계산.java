import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int e = 0;
        int s = 0;
        int m = 0;
        int answer = 0;
        while (true) {
            e++;
            s++;
            m++;
            answer++;

            if (e > 15) e = 1;
            if (s > 28) s = 1;
            if (m > 19) m = 1;

            if (e == E && s == S & m == M) break;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(answer + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
