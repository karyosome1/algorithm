import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());

        long[] list = new long[n];
        for (int i = 0; i < n; i++) {
            list[i] = Long.parseLong(st.nextToken());
        }

        long numerator = 0L;
        long denominator = 1L;

        for (int i = 0; i < n; i++) {
            long gcd = gcd(denominator, list[i]);
            denominator = (denominator * list[i]) / gcd;
        }

        for (int i = 0; i < n; i++) {
            numerator += denominator / list[i];
        }

        long reduction = gcd(denominator, numerator);
        System.out.println((denominator / reduction) + "/" + (numerator / reduction));
    }

    private static long gcd(long a, long b) {
        if (b == 0L) {
            return a;
        }
        return gcd(b, a % b);
    }
}