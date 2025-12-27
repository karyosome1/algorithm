import java.io.*;
import java.util.*;

public class Main {
    private static long reverseToLong(String s) {
        long value = 0L;
        boolean started = false;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if (!started) {
                if (c == '0') continue;
                started = true;
            }
            value = value * 10 + (c - '0');
        }
        return value;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        int n = Integer.parseInt(st.nextToken());

        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            arr[i] = reverseToLong(st.nextToken());
        }
        Arrays.sort(arr);

        StringBuilder out = new StringBuilder();
        for (long v : arr) {
            out.append(v).append('\n');
        }
        System.out.print(out);
    }
}