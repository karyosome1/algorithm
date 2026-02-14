import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        if (n == 0) {
            System.out.println(0);
            return;
        }

        long left = 1;
        long right = 3037000500L;
        long ans = 0;

        while (left <= right) {
            long mid = (left + right) >>> 1;

            if (mid >= divCeil(n, mid)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(ans);
    }

    static long divCeil(long a, long b) {
        return (a - 1) / b + 1;
    }
}
