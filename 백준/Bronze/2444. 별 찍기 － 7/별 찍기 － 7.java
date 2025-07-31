import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        // 위쪽 삼각형 (1 ~ n)
        for (int i = 1; i <= n; i++) {
            appendLine(sb, n, i);
        }

        // 아래쪽 삼각형 (n-1 ~ 1)
        for (int i = n - 1; i >= 1; i--) {
            appendLine(sb, n, i);
        }
        System.out.print(sb);
    }

    private static void appendLine(StringBuilder sb, int n, int i) {
        int spaceCount = n - i;
        int starCount = 2 * i - 1;

        sb.append(" ".repeat(spaceCount));
        sb.append("*".repeat(starCount));
        sb.append("\n");
    }
}