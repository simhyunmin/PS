import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String str = br.readLine();
        st = new StringTokenizer(str, " ");
        String first = "";
        String second = "";
        first += st.nextToken();
        first += st.nextToken();
        second += st.nextToken();
        second += st.nextToken();

        System.out.println(Long.parseLong(first) + Long.parseLong(second));




    }
}
