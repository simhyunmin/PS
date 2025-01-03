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
            map.put(c, -1);
        }

        TreeMap<Character, Integer> sortMap = new TreeMap<>(map);


        for (Character val : sortMap.keySet()) {
            for (int i = 0 ; i < str.length() ; i++) {
                if (str.charAt(i) == val) {
                    if (sortMap.get(val) > -1) {
                        break;
                    }
                    sortMap.put(val, i);
                }
            }
        }

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
