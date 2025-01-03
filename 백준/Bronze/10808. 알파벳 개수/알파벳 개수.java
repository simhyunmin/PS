import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Map<Character, Integer> map = new HashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            map.put(c, 0);
        }
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        TreeMap<Character, Integer> sortMap = new TreeMap<>(map);

        int[] arr = new int[sortMap.size()];
        int index = 0;
        for (int val : sortMap.values()) {
            arr[index++] = val;
        }

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
