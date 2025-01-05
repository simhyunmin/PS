import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while ((str = br.readLine()) != null) {
            int upperCase = 0;
            int lowerCase = 0;
            int numCase = 0;
            int emptyCase = 0;
            for (char c : str.toCharArray()) {
                switch (c) {
                    case ' ':
                        emptyCase++;
                        break;
                    default:
                        if (Character.isUpperCase(c)) {
                            upperCase++;
                        } else if (Character.isLowerCase(c)) {
                            lowerCase++;
                        } else if (Character.isDigit(c)) {
                            numCase++;
                        }
                        break;

                }
            }
            System.out.println(lowerCase + " " + upperCase + " " + numCase + " " + emptyCase);
        }
    }
}
