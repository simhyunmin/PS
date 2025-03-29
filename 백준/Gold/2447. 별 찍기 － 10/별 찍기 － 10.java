import java.io.*;

public class Main {

    static char[][] stars;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        stars = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                stars[i][j] = ' ';
            }
        }

        drawStars(0, 0, n);

        for (int i = 0; i < n; i++) {
            bw.write(stars[i]);
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    public static void drawStars(int row, int col, int size) {
        if (size == 1) {
            stars[row][col] = '*';
            return;
        }

        int newSize = size / 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    continue;
                }

                drawStars(row + i * newSize, col + j * newSize, newSize);
            }
        }
    }
}
