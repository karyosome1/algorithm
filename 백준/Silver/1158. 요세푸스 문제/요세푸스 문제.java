import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] next = new int[n + 1];
        for (int i = 1; i < n; i++) {
            next[i] = i + 1;
        }
        next[n] = 1;

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        int cur = 1;
        int prev = n;

        for (int removedCount = 0; removedCount < n; removedCount++) {

            for (int step = 1; step < k; step++) {
                prev = cur;
                cur = next[cur];
            }

            sb.append(cur);
            if (removedCount != n - 1) {
                sb.append(", ");
            }

            next[prev] = next[cur];
            cur = next[cur];
        }

        sb.append(">");
        System.out.print(sb);
    }
}