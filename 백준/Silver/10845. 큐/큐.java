import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Queue<Integer> queue = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            st = new StringTokenizer(str, " ");
            switch (st.nextToken()) {
                case "push" :
                    int num = Integer.parseInt(st.nextToken());
                    queue.add(num);
                    break;
                case "pop" :
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                        break;
                    } else {
                        System.out.println(queue.peek());
                        queue.poll();
                        break;
                    }
                case "size" :
                    System.out.println(queue.size());
                    break;
                case "empty" :
                    if (queue.isEmpty()) {
                        System.out.println(1);
                        break;
                    } else {
                        System.out.println(0);
                        break;
                    }
                case "front" :
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                        break;
                    } else {
                        System.out.println(queue.peek());
                        break;
                    }
                case "back" :
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(((LinkedList<Integer>) queue).getLast());;
                        break;
                    }
            }
        }
    }
}
