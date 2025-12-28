import java.io.*;
import java.util.*;

public class Main {

    private static boolean isUnique(int x) {
        boolean[] used = new boolean[10];

        while (x > 0) {
            int digit = x % 10;
            if (used[digit]) return false;
            used[digit] = true;
            x /= 10;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while ((line = br.readLine()) != null) {
            line = line.trim();
            if (line.isEmpty()) continue;

            StringTokenizer st = new StringTokenizer(line);
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            int total = 0;
            for (int i = start; i <= end; i++) {
                if (isUnique(i)) total++;
            }

            System.out.println(total);
        }
    }
}