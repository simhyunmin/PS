import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //에라토스테네스의 체를 이용해서 1000000이하 소수를 저장한 배열을 구하고
        int[] prNum = new int[1000001];

        for (int i = 2; i * i <= 1000000; i++) {
            if (prNum[i] != 1) {
                for (int j = i * i; j <= 1000000; j+= i) {
                    prNum[j] = 1;
                }
            }
        }
        prNum[0] = prNum[1] = 1;
        //주어진 수 이하의 소수들 끼리의 순열, 조합으로 주어진 수를 만들 수 있는 지
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //검증하면 되지 않을까?

        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0) {
                break;
            }
            int sub = Integer.MIN_VALUE;
            int fNum = 0;
            int lNum = 0;
            boolean found = false;
            for (int i = 3; i <= N / 2; i++) {
                if (prNum[i] != 1 & prNum[N - i] != 1) {
                    if (sub < (N - i) - i) {
                        sub = (N - i) - i;
                        fNum = i;
                        lNum = N - i;
                        found = true;
                        break;
                    }
                }
            }
            if (!found) {
                System.out.print("Goldbach's conjecture is wrong.\n"); // 문제 조건상 이 경우는 없음
            } else {
                System.out.println(N + " = " + fNum + " + " + lNum);
            }
        }
    }
}
