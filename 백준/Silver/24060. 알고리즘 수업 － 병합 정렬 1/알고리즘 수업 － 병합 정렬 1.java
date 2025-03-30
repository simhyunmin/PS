import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int count = 0;
    static int K;
    static int[] tmp;

    public static int[] merge_sort(int[] arr, int p, int r) {
        if (p < r){
            int q = (p + r) / 2;
            arr = merge_sort(arr, p, q);
            arr = merge_sort(arr, q + 1, r);
            arr = merge(arr, p, q, r);
        }
        return arr;
    }

    public static int[] merge(int[] arr, int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int t = 0;
        while (i <= q && j <= r) {
            if (arr[i] <= arr[j]) {
                tmp[t++] = arr[i++];
            } else {
                tmp[t++] = arr[j++];
            }
        }

        while (i <= q) {
            tmp[t++] = arr[i++];
        }

        while (j <= r) {
            tmp[t++] = arr[j++];
        }

        i = p;
        t = 0;
        while (i <= r) {
            count++;
            if (count == K) {
                System.out.println(tmp[t]);
                System.exit(0);
            }
            arr[i++] = tmp[t++];
        }
        return arr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        tmp = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        arr = merge_sort(arr, 0, arr.length - 1);

        if (K > count) {
            System.out.println(-1);
        }
    }
}