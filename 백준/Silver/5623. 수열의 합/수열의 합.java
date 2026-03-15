import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[][] s = new int[n + 1][n + 1];
        int[] a = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                s[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        if (n == 2) {
            System.out.println("1 1");
            return;
        }

        a[1] = (s[1][2] + s[1][3] - s[2][3]) / 2;

        for (int i = 2; i <= n; i++) {
            a[i] = s[i - 1][i] - a[i - 1];
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            sb.append(a[i]).append(" ");
        }

        System.out.println(sb);
    }
}