import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < T; tc++) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int current = Integer.parseInt(st.nextToken());
            int maxSum = current;

            for (int i = 1; i < N; i++) {
                int x = Integer.parseInt(st.nextToken());
                current = Math.max(x, current + x);
                maxSum = Math.max(maxSum, current);
            }

            sb.append(maxSum).append('\n');
        }

        System.out.print(sb);
    }
}