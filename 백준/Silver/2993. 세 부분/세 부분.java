import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = s.length();

        String min = buildReversedParts(s, 1, 2);

        for (int i = 1; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                String candidate = buildReversedParts(s, i, j);
                if (candidate.compareTo(min) < 0) {
                    min = candidate;
                }
            }
        }

        System.out.print(min);
    }

    private static String buildReversedParts(String s, int i, int j) {
        int n = s.length();
        char[] out = new char[n];
        int idx = 0;

        for (int k = i - 1; k >= 0; k--) out[idx++] = s.charAt(k);
        for (int k = j - 1; k >= i; k--) out[idx++] = s.charAt(k);
        for (int k = n - 1; k >= j; k--) out[idx++] = s.charAt(k);

        return new String(out);
    }
}