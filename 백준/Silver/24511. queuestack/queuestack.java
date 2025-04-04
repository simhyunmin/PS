import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();

        //자료구조 형태를 기록하는 배열 세팅
        int[] checkArray = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            checkArray[i] = Integer.parseInt(st.nextToken());
        }

        //초기값 세팅
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(st.nextToken());
            if (checkArray[i] == 0) {
                deque.add(value);
            }
        }

        //삽입 진행
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < M; i++) {
            int input = Integer.parseInt(st.nextToken());
            deque.addFirst(input);
            sb.append(deque.removeLast() + " ");
        }
        System.out.println(sb);

    }
}
