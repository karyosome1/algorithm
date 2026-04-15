import java.io.*;
import java.util.*;

public class Main {
    static final int LIMIT = 1_000_000;
    static final List<Integer> primes = new ArrayList<>();

    static {
        boolean[] isPrime = new boolean[LIMIT + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= LIMIT; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= LIMIT; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i <= LIMIT; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        System.out.println(primes.get(n - 1));
    }
}
