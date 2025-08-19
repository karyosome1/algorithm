import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine().trim());
            if (n == -1) break;

            if (n <= 2) {
                System.out.println(n + " is NOT perfect.");
                continue;
            }

            int sum = 1;
            List<Integer> small = new ArrayList<>();
            List<Integer> large = new ArrayList<>();
            small.add(1);

            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    sum += i;
                    small.add(i);
                    int q = n / i;
                    if (q != i) {
                        sum += q;
                        large.add(q);
                    }
                }
            }

            if (sum != n) {
                System.out.println(n + " is NOT perfect.");
                continue;
            }

            StringBuilder sb = new StringBuilder();
            sb.append(n).append(" = ").append(small.get(0));
            for (int k = 1; k < small.size(); k++)
                sb.append(" + ").append(small.get(k));
            for (int k = large.size() - 1; k >= 0; k--)
                sb.append(" + ").append(large.get(k));
            System.out.println(sb);
        }
    }
}