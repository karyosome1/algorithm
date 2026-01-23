import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long[] s = new long[N];
        for (int i = 0; i < N; i++) {
            s[i] = Long.parseLong(br.readLine());
        }

        long altSum = 0;
        for (int i = 0; i < N; i++) {
            altSum += (i % 2 == 0) ? s[i] : -s[i];
        }

        long[] x = new long[N];
        x[0] = altSum / 2;

        for (int i = 1; i < N; i++) {
            x[i] = s[i - 1] - x[i - 1];
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(x[i]).append('\n');
        }
        System.out.print(sb);
    }
}