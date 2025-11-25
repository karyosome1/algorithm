import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] prefix = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                int val = sc.nextInt();
                prefix[i][j] = val
                    + prefix[i - 1][j]
                    + prefix[i][j - 1]
                    - prefix[i - 1][j - 1];
            }
        }

        int k = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int h = 0; h < k; h++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int sum = prefix[x][y]
                - prefix[i - 1][y]
                - prefix[x][j - 1]
                + prefix[i - 1][j - 1];

            sb.append(sum).append('\n');
        }

        System.out.print(sb);
    }
}
