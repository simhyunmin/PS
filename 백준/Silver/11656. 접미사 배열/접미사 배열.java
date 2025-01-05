import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder("");
        ArrayList<String> arr = new ArrayList<>();
        for (int i = str.length() - 1 ; i >= 0 ; i-- ) {
            sb.insert(0, str.charAt(i));
            arr.add(String.valueOf(sb));
        }
        Collections.sort(arr);
        for (String st : arr) {
            System.out.println(st);
        }

    }
}
