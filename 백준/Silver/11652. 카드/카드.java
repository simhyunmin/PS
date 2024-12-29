import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        long[] arr = new long[T];
        
        // Long.parseLong으로 수정
        for (int i = 0; i < T; i++) {
            arr[i] = Long.parseLong(br.readLine());
        }

        Arrays.sort(arr);
        
        // HashMap을 사용하여 카운팅
        Map<Long, Integer> countMap = new HashMap<>();
        for (long num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        // 가장 많이 나온 수 찾기
        long maxNum = arr[0];
        int maxCount = countMap.get(arr[0]);
        
        for (Map.Entry<Long, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount || 
               (entry.getValue() == maxCount && entry.getKey() < maxNum)) {
                maxNum = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        
        System.out.println(maxNum);
    }
}