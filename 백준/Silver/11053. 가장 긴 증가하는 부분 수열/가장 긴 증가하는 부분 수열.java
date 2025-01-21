import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] dp = new int[N];  // dp[i]는 i번째 원소를 마지막으로 하는 가장 긴 증가하는 부분 수열의 길이

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 모든 위치에서 초기 길이는 1
        for (int i = 0; i < N; i++) {
            dp[i] = 1;
        }

        int maxLength = 1;  // 전체 수열 중 가장 긴 증가하는 부분 수열의 길이

        // 각 위치에서 가능한 가장 긴 증가하는 부분 수열의 길이를 계산
        for (int i = 1; i < N; i++) {
            // i번째 원소 이전의 모든 원소들을 검사
            for (int j = 0; j < i; j++) {
                // 현재 원소(i)가 이전 원소(j)보다 크다면
                if (arr[i] > arr[j]) {
                    // j까지의 증가 수열 길이 + 1과 현재 i까지의 길이 중 큰 값을 선택
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLength = Math.max(maxLength, dp[i]);
        }
        System.out.println(maxLength);


    }
}
