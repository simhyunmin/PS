import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String newStr = "";
        for (Character c : str.toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    newStr += String.valueOf((char)((c - 'a' + 13) % 26 + 'a'));
                } else if (c >= 'A' && c <= 'Z') {
                    newStr += String.valueOf((char)((c - 'A' + 13) % 26 + 'A'));
                } else {
                    newStr += String.valueOf(c);
                }

        }
        System.out.println(newStr);
    }
}
