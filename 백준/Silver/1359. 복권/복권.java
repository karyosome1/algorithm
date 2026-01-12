import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        double numerator = 0.0;

        for (int i = k; i <= m; i++) {
            long a = comb(m, i);
            long b = comb(n - m, m - i);
            numerator += (double) a * (double) b;
        }

        double denom = (double) comb(n, m);
        double ans = numerator / denom;

        System.out.printf("%.15f%n", ans);
    }

    static long comb(int n, int r) {
        if (r < 0 || r > n) return 0;
        r = Math.min(r, n - r);

        long res = 1;
        for (int i = 1; i <= r; i++) {
            res = res * (n - i + 1) / i;
        }
        return res;
    }
}