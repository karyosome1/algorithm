import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());

        int[][] dp = new int[41][2];
        dp[0][0] = 1; dp[0][1] = 0;
        dp[1][0] = 0; dp[1][1] = 1;

        for (int n = 2; n <= 40; n++) {
            dp[n][0] = dp[n - 1][0] + dp[n - 2][0];
            dp[n][1] = dp[n - 1][1] + dp[n - 2][1];
        }

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine().trim());
            sb.append(dp[n][0]).append(' ').append(dp[n][1]).append('\n');
        }
        System.out.print(sb);
    }
}