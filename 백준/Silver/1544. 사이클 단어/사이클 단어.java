import java.io.*;
import java.util.*;

public class Main {
    private static String normalize(String s) {
        int n = s.length();
        String doubled = s + s;
        String best = s;

        for (int i = 1; i < n; i++) {
            String rotated = doubled.substring(i, i + n);
            if (rotated.compareTo(best) < 0) {
                best = rotated;
            }
        }
        return best;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(normalize(br.readLine()));
        }
        System.out.println(set.size());
    }
}