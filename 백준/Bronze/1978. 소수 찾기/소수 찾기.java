import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        int read = 0;
        int primeCount = 0;

        StringTokenizer st = new StringTokenizer("");
        while (read < n) {
            if (!st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            while (st.hasMoreTokens() && read < n) {
                int x = Integer.parseInt(st.nextToken());
                if (isPrime(x)) primeCount++;
                read++;
            }
        }
        System.out.println(primeCount);
    }
    private static boolean isPrime(int n) {
        if (n < 2 ) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        int r = (int) Math.sqrt(n);
        for (int i = 3; i <= r; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}