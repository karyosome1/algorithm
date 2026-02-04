import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        double first = Double.parseDouble(br.readLine());
        double dp = first;
        double ans = first;

        for (int i = 1; i < n; i++) {
            double x = Double.parseDouble(br.readLine());
            dp = Math.max(x, x * dp);
            ans = Math.max(ans, dp);
        }

        System.out.printf("%.3f\n", ans);
    }
}