import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long[] pos = new long[n];

        for (int i = 0; i < n; i++) {
            pos[i] = Long.parseLong(br.readLine());
        }

        long gcd = 0;
        for (int i = 0; i < n - 1; i++) {
            long dist = pos[i + 1] - pos[i];
            gcd = gcd(dist, gcd);
        }

        long totalTrees = (pos[n - 1] - pos[0]) / gcd + 1;
        long answer = totalTrees - n;

        System.out.println(answer);
    }

    static long gcd(long a, long b) {
        while (b != 0) {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
