import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int t = read();

        while (t-- > 0) {
            int n = read();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = read();

            boolean isZero = false;

            for (int k = 0; k <= 1000; k++) {
                boolean allZero = true;
                for (int val : arr) {
                    if (val != 0) {
                        allZero = false;
                        break;
                    }
                }

                if (allZero) {
                    isZero = true;
                    break;
                }

                if (k == 1000) break;

                int first = arr[0];
                for (int i = 0; i < n - 1; i++) {
                    arr[i] = Math.abs(arr[i] - arr[i + 1]);
                }
                arr[n - 1] = Math.abs(arr[n - 1] - first);
            }

            sb.append(isZero ? "ZERO\n" : "LOOP\n");
        }
        System.out.print(sb);
    }

    private static int read() throws IOException {
        int c, n = 0;
        while ((c = System.in.read()) <= 32);
        n = c & 15;
        while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }
}